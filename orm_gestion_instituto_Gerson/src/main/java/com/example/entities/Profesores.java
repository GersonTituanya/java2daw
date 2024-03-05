package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Profesores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Integer id;

    private String nombre;

    private String primer_apellido;

    private String segundo_apellido;

    private String telefono;

    private Integer profesor_direccion;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnoreProperties("profesor")
    @JsonIgnore
    private Direcciones direccion;

    @OneToMany(mappedBy = "profesorModulo", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Modulos> listaModulos;

    public Profesores() {
    }

    public Profesores(Integer id, String nombre, String primer_apellido, String segundo_apellido, String telefono, Integer profesor_direccion, Direcciones direccion, List<Modulos> listaModulos) {
        this.id = id;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.telefono = telefono;
        this.profesor_direccion = profesor_direccion;
        this.direccion = direccion;
        this.listaModulos = listaModulos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getProfesor_direccion() {
        return profesor_direccion;
    }

    public void setProfesor_direccion(Integer profesor_direccion) {
        this.profesor_direccion = profesor_direccion;
    }

    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    public List<Modulos> getListaModulos() {
        return listaModulos;
    }

    public void setListaModulos(List<Modulos> listaModulos) {
        this.listaModulos = listaModulos;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", primer_apellido='" + primer_apellido + '\'' +
                ", segundo_apellido='" + segundo_apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", profesor_direccion=" + profesor_direccion +
                ", direccion=" + direccion +
                ", listaModulos=" + listaModulos +
                '}';
    }
}
