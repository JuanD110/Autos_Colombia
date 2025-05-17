package com.autos_colombia.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.autos_colombia.v1.model.Novedad;
import com.autos_colombia.v1.service.NovedadService;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/novedades")
public class NovedadController {

    @Autowired
    private NovedadService novedadService;

    @GetMapping
    public String listarNovedades(Model model) {
        model.addAttribute("novedades", novedadService.listarNovedades());
        return "novedades/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaNovedad(Model model) {
        model.addAttribute("novedad", new Novedad());
        return "novedades/formulario";
    }

    @PostMapping
    public String guardarNovedad(@ModelAttribute Novedad novedad) {
        novedadService.guardarNovedad(novedad);
        return "redirect:/novedades";
    }

    @GetMapping("/editar/{id}")
    public String editarNovedad(@PathVariable Long id, Model model) {
        model.addAttribute("novedad", novedadService.obtenerNovedadPorId(id));
        return "novedades/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarNovedad(@PathVariable Long id) {
        novedadService.eliminarNovedad(id);
        return "redirect:/novedades";
    }
}


