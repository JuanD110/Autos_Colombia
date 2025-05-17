package com.autos_colombia.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.autos_colombia.v1.model.Celda;
import com.autos_colombia.v1.service.CeldaService;

@Controller
@RequestMapping("/celdas")
public class CeldaController {

    @Autowired
    private CeldaService celdaService;

    @GetMapping
    public String listarCeldas(Model model) {
        model.addAttribute("celdas", celdaService.listarCeldas());
        return "celdas/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoCelda(Model model) {
        model.addAttribute("celda", new Celda());
        return "celdas/formulario";
    }

    @PostMapping("/guardar")
    public String guardarCelda(@ModelAttribute("celda") Celda celda) {
        celdaService.guardarCelda(celda);
        return "redirect:/celdas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarCelda(@PathVariable Long id, Model model) {
        Celda celda = celdaService.obtenerCeldaPorId(id);
        model.addAttribute("celda", celda);
        return "celdas/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCelda(@PathVariable Long id) {
        celdaService.eliminarCelda(id);
        return "redirect:/celdas";
    }
}
