package com.example.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Constructors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String constructorref;

    @Column(length = 100)
    private String name;

    @Column(length = 50)
    private String nationality;

    @Column(length = 100)
    private String url;

    @ManyToOne
    @JoinColumn(name = "driverid", foreignKey = @ForeignKey(name = "constructorid"))
    private Drivers drivers;

    public Constructors() {
    }

    public Constructors(Integer id, String constructorref, String name, String nationality, String url, Drivers drivers) {
        this.id = id;
        this.constructorref = constructorref;
        this.name = name;
        this.nationality = nationality;
        this.url = url;
        this.drivers = drivers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConstructorref() {
        return constructorref;
    }

    public void setConstructorref(String constructorref) {
        this.constructorref = constructorref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Drivers getDrivers() {
        return drivers;
    }

    public void setDrivers(Drivers drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Constructors{" +
                "id=" + id +
                ", constructorref='" + constructorref + '\'' +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", url='" + url + '\'' +
                ", drivers=" + drivers +
                '}';
    }
}
