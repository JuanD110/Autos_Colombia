package com.autos_colombia.v1.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
    @Id @GeneratedValue
    private Long id;
    private LocalDateTime fechaPago;
    private double valor;
    private String metodoPago;
    @ManyToOne
    private EntradaSalida registro;
}