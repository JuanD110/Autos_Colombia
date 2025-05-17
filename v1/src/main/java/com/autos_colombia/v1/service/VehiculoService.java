package com.autos_colombia.v1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos_colombia.v1.model.Vehiculo;
import com.autos_colombia.v1.repository.VehiculoRepository;

@Service
public class VehiculoService {
    @Autowired private VehiculoRepository repository;
   
    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return repository.save(vehiculo);
    }

    
    public List<Vehiculo> listarVehiculos() {
        return repository.findAll();
    }

    
    public void eliminarVehiculo(Long id) {
        repository.deleteById(id);
    }

    
    public Vehiculo obtenerVehiculoPorId(Long id) {
        Optional<Vehiculo> optionalVehiculo = repository.findById(id);
        return optionalVehiculo.orElse(null);
    }
}
