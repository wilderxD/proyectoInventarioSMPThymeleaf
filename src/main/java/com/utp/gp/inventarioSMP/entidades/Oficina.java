package com.utp.gp.inventarioSMP.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Table(name = "oficinas")
public class Oficina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty
    private String nombre_oficina;

    public Oficina(Long id, String nombre_oficina) {
        this.id = id;
        this.nombre_oficina = nombre_oficina;
    }

    public Oficina() {        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_oficina() {
        return nombre_oficina;
    }

    public void setNombre_oficina(String nombre_oficina) {
        this.nombre_oficina = nombre_oficina;
    }
    
    
}
