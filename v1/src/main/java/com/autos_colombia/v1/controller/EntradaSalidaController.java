package com.autos_colombia.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.autos_colombia.v1.model.EntradaSalida;
import com.autos_colombia.v1.service.EntradaSalidaService;

@Controller
@RequestMapping("/entradasalida")
public class EntradaSalidaController {
    @Autowired
    private EntradaSalidaService service;

    @GetMapping
    public String listarEntradaSalidas(Model model) {
        model.addAttribute("entrada_salida", service.listarEntradaSalidas());
        return "entrada_salida/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoEntradaSalida(Model model) {
        model.addAttribute("entrada_salida", new EntradaSalida());
        return "entrada_salida/formulario";
    }

    @PostMapping("/guardar")
    public String guardarEntradaSalida(@ModelAttribute("entrada_salida") EntradaSalida entradaSalida) {
        service.guardarEntradaSalida(entradaSalida);
        return "redirect:/entradasalida";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarEntradaSalida(@PathVariable Long id, Model model) {
        EntradaSalida entradaSalida = service.obtenerEntradaSalidaPorId(id);
        model.addAttribute("entrada_salida", entradaSalida);
        return "entrada_salida/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEntradaSalida(@PathVariable Long id) {
        service.eliminarEntradaSalida(id);
        return "redirect:/entradasalida";
    }
}
