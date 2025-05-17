package com.autos_colombia.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*; 

import com.autos_colombia.v1.model.Vehiculo;
import com.autos_colombia.v1.service.VehiculoService;


@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    
    @GetMapping
    public String listarVehiculos(Model model) {
        model.addAttribute("vehiculos", vehiculoService.listarVehiculos());
        return "vehiculos/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoVehiculo(Model model) {
        model.addAttribute("vehiculo", new Vehiculo());
        return "vehiculos/formulario";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute("vehiculo") Vehiculo vehiculo) {
        vehiculoService.guardarVehiculo(vehiculo);
        return "redirect:/vehiculos";
    }

    

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarVehiculo(@PathVariable Long id, Model model) {
    Vehiculo vehiculo = vehiculoService.obtenerVehiculoPorId(id);
    model.addAttribute("vehiculo", vehiculo);
    return "vehiculos/formulario";
    }


    @GetMapping("/eliminar/{id}")
    public String eliminarVehiculo(@PathVariable Long id) {
        vehiculoService.eliminarVehiculo(id);
        return "redirect:/vehiculos";
    }
}
