package com.autos_colombia.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos_colombia.v1.model.Pago;
import com.autos_colombia.v1.repository.PagoRepository;

@Service
public class PagoService {
    @Autowired private PagoRepository repo;
    public Pago save(Pago p) { return repo.save(p); }
    public List<Pago> list() { return repo.findAll(); }
}