package com.autos_colombia.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.autos_colombia.v1.model.Pago;
import com.autos_colombia.v1.service.PagoService;

@Controller
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @GetMapping
    public String listarPagos(Model model) {
        model.addAttribute("pagos", pagoService.listarPagos());
        return "pagos/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoPago(Model model) {
        model.addAttribute("pago", new Pago());
        return "pagos/formulario";
    }

    @PostMapping("/guardar")
    public String guardarPago(@ModelAttribute("pago") Pago pago) {
        pagoService.guardarPago(pago);
        return "redirect:/pagos";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPago(@PathVariable Long id, Model model) {
        Pago pago = pagoService.obtenerPagoPorId(id);
        model.addAttribute("pago", pago);
        return "pagos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPago(@PathVariable Long id) {
        pagoService.eliminarPago(id);
        return "redirect:/pagos";
    }
}
