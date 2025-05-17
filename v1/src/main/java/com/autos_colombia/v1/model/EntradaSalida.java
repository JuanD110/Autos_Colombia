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
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getEntrada() {
        return entrada;
    }
    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }
    public LocalDateTime getSalida() {
        return salida;
    }
    public void setSalida(LocalDateTime salida) {
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
