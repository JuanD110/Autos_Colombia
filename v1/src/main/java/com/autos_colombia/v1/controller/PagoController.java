package com.autos_colombia.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autos_colombia.v1.model.Pago;
import com.autos_colombia.v1.service.PagoService;

@RestController @RequestMapping("/pagos")
public class PagoController {
    @Autowired private PagoService service;
    @PostMapping public Pago save(@RequestBody Pago p) { return service.save(p); }
    @GetMapping public List<Pago> list() { return service.list(); }
}
