package com.autos_colombia.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos_colombia.v1.model.Novedad;
import com.autos_colombia.v1.repository.NovedadRepository;

@Service
public class NovedadService {
    @Autowired private NovedadRepository repo;
    public Novedad save(Novedad n) { return repo.save(n); }
    public List<Novedad> list() { return repo.findAll(); }
}