package com.autos_colombia.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autos_colombia.v1.model.EntradaSalida;
import com.autos_colombia.v1.service.EntradaSalidaService;

@RestController @RequestMapping("/entradasalida")
public class EntradaSalidaController {
    @Autowired private EntradaSalidaService service;
    @PostMapping public EntradaSalida save(@RequestBody EntradaSalida e) { return service.save(e); }
    @GetMapping public List<EntradaSalida> list() { return service.list(); }
}
