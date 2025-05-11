package com.autos_colombia.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos_colombia.v1.model.Celda;
import com.autos_colombia.v1.repository.CeldaRepository;

@Service
public class CeldaService {
    @Autowired private CeldaRepository repo;
    public Celda save(Celda c) { return repo.save(c); }
    public List<Celda> list() { return repo.findAll(); }
}