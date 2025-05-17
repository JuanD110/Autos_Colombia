package com.autos_colombia.v1.service;

import com.autos_colombia.v1.model.Pago;
import com.autos_colombia.v1.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    @Autowired
    private PagoRepository repository;

    // Guarda o actualiza un pago
    public Pago guardarPago(Pago pago) {
        return repository.save(pago);
    }

    // Lista todos los pagos
    public List<Pago> listarPagos() {
        return repository.findAll();
    }

    // Elimina un pago por ID
    public void eliminarPago(Long id) {
        repository.deleteById(id);
    }

    // Obtiene un pago por ID
    public Pago obtenerPagoPorId(Long id) {
        Optional<Pago> optionalPago = repository.findById(id);
        return optionalPago.orElse(null);
    }
}
