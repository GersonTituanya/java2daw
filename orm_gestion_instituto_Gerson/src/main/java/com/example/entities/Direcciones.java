package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class Direcciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numero;

    private String calle;

    private String poblacion;

    private String provincia;

    @OneToOne(mappedBy = "direccion",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnoreProperties("direccion")
    @JsonIgnore
    private Profesores profesor;

    public Direcciones() {
    }

    public Direcciones(Integer id, Integer numero, String calle, String poblacion, String provincia, Profesores profesor) {
        this.id = id;
        this.numero = numero;
        this.calle = calle;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.profesor = profesor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Direcciones{" +
                "id=" + id +
                ", numero=" + numero +
                ", calle='" + calle + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
