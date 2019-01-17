package com.example.demo.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Cabecera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripciom;
    private Date fecha;
    private String estado;
    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripciom() {
        return descripciom;
    }

    public void setDescripciom(String descripciom) {
        this.descripciom = descripciom;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Cabecera{" +
                "id=" + id +
                ", descripciom='" + descripciom + '\'' +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
