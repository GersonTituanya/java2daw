package com.example.model;

import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
public class Drivers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String forename;

    @Column(length = 255)
    private String surname;

    @Column(length = 255)
    private String nationality;

    @Column(length = 255)
    private String url;

    @Column(unique = true)
    private String code;

    private Integer constructorid;

    private Date dob;

    @OneToMany(mappedBy = "drivers")
    @JsonIgnore
    private List<Constructors> constructors = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "driver-race",
            joinColumns = @JoinColumn(name = "id_driver", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_race", referencedColumnName = "id"))
    private List<Races> races = new ArrayList<>();

    public Drivers() {
    }

    public Drivers(Long id, String forename, String surname, String nationality, String url, String code, Integer constructorid, Date dob, List<Constructors> constructors, List<Races> races) {
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        this.nationality = nationality;
        this.url = url;
        this.code = code;
        this.constructorid = constructorid;
        this.dob = dob;
        this.constructors = constructors;
        this.races = races;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getConstructorid() {
        return constructorid;
    }

    public void setConstructorid(Integer constructorid) {
        this.constructorid = constructorid;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<Constructors> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<Constructors> constructors) {
        this.constructors = constructors;
    }

    public List<Races> getRaces() {
        return races;
    }

    public void setRaces(List<Races> races) {
        this.races = races;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "id=" + id +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", url='" + url + '\'' +
                ", code='" + code + '\'' +
                ", constructorid=" + constructorid +
                ", dob=" + dob +
                ", constructors=" + constructors +
                ", races=" + races +
                '}';
    }
}