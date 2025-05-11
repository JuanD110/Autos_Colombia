package com.autos_colombia.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos_colombia.v1.model.EntradaSalida;
import com.autos_colombia.v1.repository.EntradaSalidaRepository;

@Service
public class EntradaSalidaService {
    @Autowired private EntradaSalidaRepository repo;
    public EntradaSalida save(EntradaSalida e) { return repo.save(e); }
    public List<EntradaSalida> list() { return repo.findAll(); }
}
