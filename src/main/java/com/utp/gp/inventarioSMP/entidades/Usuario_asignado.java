package com.utp.gp.inventarioSMP.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "usuarios_asignados")
public class Usuario_asignado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty
    @Column(name = "codigo")
    private String codigo;
    
    @NotEmpty
    @Column(name = "nombre")
    private String nombre;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name = "oficina")
    @ToString.Exclude
    private Oficina oficina;
        
    @ManyToOne
    @JoinColumn(name = "codigo_equipo")
    @ToString.Exclude
    private Equipo equipo;
    
    @Column(name = "fecha_asignado", nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_asignado;

    public Usuario_asignado() {
    }

    public Usuario_asignado(Long id, String codigo, String nombre, Oficina oficina, Equipo equipo, Date fecha_asignado) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.oficina = oficina;
        this.equipo = equipo;
        this.fecha_asignado = fecha_asignado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Date getFecha_asignado() {
        return fecha_asignado;
    }

    public void setFecha_asignado(Date fecha_asignado) {
        this.fecha_asignado = fecha_asignado;
    }
    
    
}

