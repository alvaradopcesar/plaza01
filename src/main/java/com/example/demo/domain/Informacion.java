package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Informacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCab;
    private String texto1;
    private String texto2;
    private Date fecha;
    private String textoGrande;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCab() {
        return idCab;
    }

    public void setIdCab(Long idCab) {
        this.idCab = idCab;
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTextoGrande() {
        return textoGrande;
    }

    public void setTextoGrande(String textoGrande) {
        this.textoGrande = textoGrande;
    }

    @Override
    public String toString() {
        return "Informacion{" +
                "id=" + id +
                ", idCab=" + idCab +
                ", texto1='" + texto1 + '\'' +
                ", texto2='" + texto2 + '\'' +
                ", fecha=" + fecha +
                ", textoGrande='" + textoGrande + '\'' +
                '}';
    }
}