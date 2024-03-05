package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class Modulos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String curso;

    private Integer horas;

    private String nombre;

    private Integer profesor_id;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    //si no ponemos esta etiqueta, tendremos un bucle infinito
    @JsonIgnoreProperties("listaModulos")
    @JsonIgnore
    private Profesores profesorModulo;

    public Modulos() {
    }

    public Modulos(Integer id, String curso, Integer horas, String nombre, Integer profesor_id, Profesores profesorModulo) {
        this.id = id;
        this.curso = curso;
        this.horas = horas;
        this.nombre = nombre;
        this.profesor_id = profesor_id;
        this.profesorModulo = profesorModulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(Integer profesor_id) {
        this.profesor_id = profesor_id;
    }

    public Profesores getProfesorModulo() {
        return profesorModulo;
    }

    public void setProfesorModulo(Profesores profesorModulo) {
        this.profesorModulo = profesorModulo;
    }

    @Override
    public String toString() {
        return "Modulos{" +
                "id=" + id +
                ", curso='" + curso + '\'' +
                ", horas=" + horas +
                ", nombre='" + nombre + '\'' +
                ", profesor_id=" + profesor_id +
                ", profesorModulo=" + profesorModulo +
                '}';
    }
}
