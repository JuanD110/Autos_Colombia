package com.autos_colombia.v1.service;


import com.autos_colombia.v1.model.Novedad;
import com.autos_colombia.v1.repository.NovedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NovedadService {

    @Autowired
    private NovedadRepository novedadRepository;

    public List<Novedad> listarNovedades() {
        return novedadRepository.findAll();
    }

    public Novedad guardarNovedad(Novedad novedad) {
        return novedadRepository.save(novedad);
    }

    public Novedad obtenerNovedadPorId(Long id) {
        Optional<Novedad> optional = novedadRepository.findById(id);
        return optional.orElse(null); 
    }

    public void eliminarNovedad(Long id) {
        novedadRepository.deleteById(id);
    }
}

