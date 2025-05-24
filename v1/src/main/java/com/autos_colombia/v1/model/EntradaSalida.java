package com.autos_colombia.v1.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrada_salida")
public class EntradaSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate entrada;
    private LocalDate salida;
    @ManyToOne
    private Vehiculo vehiculo;
    @ManyToOne
    private Celda celda;
    private String estado;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getEntrada() {
        return entrada;
    }
    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }
    public LocalDate getSalida() {
        return salida;
    }
    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Celda getCelda() {
        return celda;
    }
    public void setCelda(Celda celda) {
        this.celda = celda;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
