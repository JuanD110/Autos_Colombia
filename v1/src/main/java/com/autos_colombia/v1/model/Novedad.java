package com.autos_colombia.v1.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "novedad")
public class Novedad {
    @Id @GeneratedValue
    private Long id;
    private String descripcion;
    private LocalDateTime fecha;
    @ManyToOne
    private Vehiculo vehiculo;

}