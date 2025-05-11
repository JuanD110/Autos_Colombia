package com.autos_colombia.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos_colombia.v1.model.Usuario;
import com.autos_colombia.v1.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired private UsuarioRepository repo;
    public Usuario save(Usuario u) { return repo.save(u); }
    public List<Usuario> list() { return repo.findAll(); }
}