package com.autos_colombia.v1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos_colombia.v1.model.EntradaSalida;
import com.autos_colombia.v1.repository.EntradaSalidaRepository;

@Service
public class EntradaSalidaService {
    @Autowired private EntradaSalidaRepository repository;

    
    public EntradaSalida guardarEntradaSalida(EntradaSalida entradaSalida) {
        return repository.save(entradaSalida);
    }

    
    public List<EntradaSalida> listarEntradaSalidas() {
        return repository.findAll();
    }

    
    public void eliminarEntradaSalida(Long id) {
        repository.deleteById(id);
    }

    
    public EntradaSalida obtenerEntradaSalidaPorId(Long id) {
        Optional<EntradaSalida> optionalEntradaSalida = repository.findById(id);
        return optionalEntradaSalida.orElse(null);
    }
}


