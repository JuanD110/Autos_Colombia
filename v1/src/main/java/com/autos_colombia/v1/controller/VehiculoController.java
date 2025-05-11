package com.autos_colombia.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autos_colombia.v1.model.Vehiculo;
import com.autos_colombia.v1.service.VehiculoService;

@RestController @RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired private VehiculoService service;
    @PostMapping public Vehiculo save(@RequestBody Vehiculo v) { return service.save(v); }
    @GetMapping public List<Vehiculo> list() { return service.list(); }
}