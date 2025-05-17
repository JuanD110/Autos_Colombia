package com.autos_colombia.v1.service;

import com.autos_colombia.v1.model.Celda;
import com.autos_colombia.v1.repository.CeldaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CeldaService {

    @Autowired
    private CeldaRepository repository;

    
    public Celda guardarCelda(Celda celda) {
        return repository.save(celda);
    }

    
    public List<Celda> listarCeldas() {
        return repository.findAll();
    }

    
    public void eliminarCelda(Long id) {
        repository.deleteById(id);
    }

    
    public Celda obtenerCeldaPorId(Long id) {
        Optional<Celda> optionalCelda = repository.findById(id);
        return optionalCelda.orElse(null);
    }
}

