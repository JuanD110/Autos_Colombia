package com.autos_colombia.v1.model;

import java.time.LocalDate;
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
    private LocalDate fechaPago;
    private double valor;
    private String metodoPago;
    @ManyToOne
    private EntradaSalida registro;
    @ManyToOne
    private Usuario usuario;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getFechaPago() {
        return fechaPago;
    }
    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    public EntradaSalida getRegistro() {
        return registro;
    }
    public void setRegistro(EntradaSalida registro) {
        this.registro = registro;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}