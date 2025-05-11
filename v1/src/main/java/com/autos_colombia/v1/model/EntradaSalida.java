package com.autos_colombia.v1.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrada_salida")
public class EntradaSalida {
    @Id @GeneratedValue
    private Long id;
    private LocalDateTime entrada;
    private LocalDateTime salida;
    @ManyToOne
    private Vehiculo vehiculo;
    @ManyToOne
    private Celda celda;
    private String estado;
}
