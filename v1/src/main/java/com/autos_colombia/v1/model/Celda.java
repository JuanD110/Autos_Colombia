package com.autos_colombia.v1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "celda")
public class Celda {
    @Id
    @GeneratedValue
    private Long id;
    private String estado;
    private String tipo;
    private String numeroCelda;
}
