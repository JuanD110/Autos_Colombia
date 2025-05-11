package com.autos_colombia.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autos_colombia.v1.model.Usuario;
import com.autos_colombia.v1.service.UsuarioService;

@RestController @RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired private UsuarioService service;
    @PostMapping public Usuario save(@RequestBody Usuario u) { return service.save(u); }
    @GetMapping public List<Usuario> list() { return service.list(); }
}
