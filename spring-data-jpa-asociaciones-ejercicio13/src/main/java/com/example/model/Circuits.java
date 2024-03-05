package com.example.model;

import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

import java.util.Date;
@Entity
public class Circuits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String circuitref;

    @Column(length = 100)
    private String name;

    @Column(length = 50)
    private String location;

    @Column(length = 50)
    private String country;

    private double lat;

    private double ing;

    private Integer alt;


    @Column(length = 100)
    private String url;

    @OneToOne(mappedBy = "circuits" , fetch = FetchType.LAZY)
    @JsonIgnore
    private Races races;

    public Circuits() {
    }

    public Circuits(Integer id, String circuitref, String name, String location, String country, double lat, double ing, Integer alt, String url, Races races) {
        this.id = id;
        this.circuitref = circuitref;
        this.name = name;
        this.location = location;
        this.country = country;
        this.lat = lat;
        this.ing = ing;
        this.alt = alt;
        this.url = url;
        this.races = races;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCircuitref() {
        return circuitref;
    }

    public void setCircuitref(String circuitref) {
        this.circuitref = circuitref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getIng() {
        return ing;
    }

    public void setIng(double ing) {
        this.ing = ing;
    }

    public Integer getAlt() {
        return alt;
    }

    public void setAlt(Integer alt) {
        this.alt = alt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Races getRaces() {
        return races;
    }

    public void setRaces(Races races) {
        this.races = races;
    }

    @Override
    public String toString() {
        return "Circuits{" +
                "id=" + id +
                ", circuitref='" + circuitref + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", ing=" + ing +
                ", alt=" + alt +
                ", url='" + url + '\'' +
                ", races=" + races +
                '}';
    }
}
