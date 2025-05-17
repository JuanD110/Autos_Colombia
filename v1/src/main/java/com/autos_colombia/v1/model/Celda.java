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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(String numeroCelda) {
        this.numeroCelda = numeroCelda;
    }

}
