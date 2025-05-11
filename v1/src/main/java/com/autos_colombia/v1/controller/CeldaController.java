package com.autos_colombia.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autos_colombia.v1.model.Celda;
import com.autos_colombia.v1.service.CeldaService;

@RestController @RequestMapping("/celdas")
public class CeldaController {
    @Autowired private CeldaService service;
    @PostMapping public Celda save(@RequestBody Celda c) { return service.save(c); }
    @GetMapping public List<Celda> list() { return service.list(); }
}
