package com.example.model;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import net.minidev.json.annotate.JsonIgnore;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Races {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer year;

    private Integer round;

    private Integer circuitid;

    @Column(length = 100)
    private String name;

    private Date date;

    private LocalTime time;

    @Column(length = 100)
    private String url;

    @ManyToMany(mappedBy = "races")
    private List<Drivers> drivers = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "id_circuit" , foreignKey = @ForeignKey(name= "circuitid"))
    @JsonIgnore
    private Circuits circuits;

    public Races() {
    }

    public Races(Integer id, Integer year, Integer round, Integer circuitid, String name, Date date, LocalTime time, String url, List<Drivers> drivers, Circuits circuits) {
        this.id = id;
        this.year = year;
        this.round = round;
        this.circuitid = circuitid;
        this.name = name;
        this.date = date;
        this.time = time;
        this.url = url;
        this.drivers = drivers;
        this.circuits = circuits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getCircuitid() {
        return circuitid;
    }

    public void setCircuitid(Integer circuitid) {
        this.circuitid = circuitid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Drivers> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Drivers> drivers) {
        this.drivers = drivers;
    }

    public Circuits getCircuits() {
        return circuits;
    }

    public void setCircuits(Circuits circuits) {
        this.circuits = circuits;
    }

    @Override
    public String toString() {
        return "Races{" +
                "id=" + id +
                ", year=" + year +
                ", round=" + round +
                ", circuitid=" + circuitid +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", url='" + url + '\'' +
                ", drivers=" + drivers +
                ", circuits=" + circuits +
                '}';
    }
}
