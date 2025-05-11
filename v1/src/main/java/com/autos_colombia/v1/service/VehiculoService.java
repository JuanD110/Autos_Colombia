package com.autos_colombia.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos_colombia.v1.model.Vehiculo;
import com.autos_colombia.v1.repository.VehiculoRepository;

@Service
public class VehiculoService {
    @Autowired private VehiculoRepository repo;
    public Vehiculo save(Vehiculo v) { return repo.save(v); }
    public List<Vehiculo> list() { return repo.findAll(); }
}