package com.autos_colombia.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autos_colombia.v1.model.Novedad;
import com.autos_colombia.v1.service.NovedadService;

@RestController @RequestMapping("/novedades")
public class NovedadController {
    @Autowired private NovedadService service;
    @PostMapping public Novedad save(@RequestBody Novedad n) { return service.save(n); }
    @GetMapping public List<Novedad> list() { return service.list(); }
}

