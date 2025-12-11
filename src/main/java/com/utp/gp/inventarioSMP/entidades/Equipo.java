package com.utp.gp.inventarioSMP.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.ToString;

@Entity
@Table(name = "equipos")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String equipo_codigo;

    @NotEmpty
    private String equipo_descripcion;

    @NotNull
    private double valor;

    @NotEmpty
    @Column(name = "tipo_moneda")
    private String tipoMoneda;

    @NotEmpty
    private String observacion;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name = "categoria")
    @ToString.Exclude
    private Categoria categoria;

    @NotEmpty
    private String estado;

    @ManyToOne
    @JoinColumn(name = "asignado")
    @ToString.Exclude
    private Usuario_asignado asignado;

    public Equipo(Long id, String equipo_codigo, String equipo_descripcion, double valor, String tipoMoneda, String observacion, Categoria categoria, String estado, Usuario_asignado usuario_asignado) {
        this.id = id;
        this.equipo_codigo = equipo_codigo;
        this.equipo_descripcion = equipo_descripcion;
        this.valor = valor;
        this.tipoMoneda = tipoMoneda;
        this.observacion = observacion;
        this.categoria = categoria;
        this.estado = estado;
        this.asignado = usuario_asignado;

    }

    public Equipo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipo_codigo() {
        return equipo_codigo;
    }

    public void setEquipo_codigo(String equipo_codigo) {
        this.equipo_codigo = equipo_codigo;
    }

    public String getEquipo_descripcion() {
        return equipo_descripcion;
    }

    public void setEquipo_descripcion(String equipo_descripcion) {
        this.equipo_descripcion = equipo_descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario_asignado getAsignado() {
        return asignado;
    }

    public void setAsignado(Usuario_asignado asignado) {
        this.asignado = asignado;
    }
    
}
