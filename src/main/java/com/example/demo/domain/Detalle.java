package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCab;
    private String nombreFile;
    private String file64;

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

    public String getNombreFile() {
        return nombreFile;
    }

    public void setNombreFile(String nombreFile) {
        this.nombreFile = nombreFile;
    }

    public String getFile64() {
        return file64;
    }

    public void setFile64(String file64) {
        this.file64 = file64;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "id=" + id +
                ", idCab=" + idCab +
                ", nombreFile='" + nombreFile + '\'' +
                ", File64='" + file64 + '\'' +
                '}';
    }
}
