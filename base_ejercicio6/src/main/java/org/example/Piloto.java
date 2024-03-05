package org.example;

import java.util.Date;
import java.util.List;

public class Piloto {

    public Piloto(int driverid, int constuctorid, String code, String forename, String surname, Date dob, String nacionality, String url) {
        this.driverid = driverid;
        this.constuctorid = constuctorid;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nacionality = nacionality;
        this.url = url;
    }

    private int driverid , constuctorid ;
    private String code , forename , surname , nacionality , url ;
    private Date dob;
    List<Piloto> pilotos;

    public int getDriverid() {
        return driverid;
    }

    public int getConstuctorid() {
        return constuctorid;
    }

    public String getCode() {
        return code;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public java.util.Date getDob() {
        return dob;
    }

    public String getNacionality() {
        return nacionality;
    }

    public String getUrl() {
        return url;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public void setConstuctorid(int constuctorid) {
        this.constuctorid = constuctorid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "driverid=" + driverid +
                ", constuctorid=" + constuctorid +
                ", code='" + code + '\'' +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob='" + dob + '\'' +
                ", nacionality='" + nacionality + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
