package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class OperacionesCRUDPilotos {

    public static void crearPiloto(PreparedStatement sentencia, Piloto piloto) throws SQLException {

        sentencia.setInt(1, piloto.getDriverid());
        sentencia.setString(2, piloto.getCode());
        sentencia.setString(3, piloto.getForename());
        sentencia.setString(4, piloto.getSurname());
        sentencia.setDate(5, (Date) piloto.getDob());
        sentencia.setString(6, piloto.getNacionality());
        sentencia.setInt(7, piloto.getConstuctorid());
        sentencia.setString(8, piloto.getUrl());

        sentencia.executeUpdate();

        System.out.println("Piloto añadido correctamente");
    }

    public static void leerPiloto(PreparedStatement sentencia, List<Piloto> pilotos, int id) throws SQLException {

        sentencia.setInt(1, id);
        ResultSet resultados = sentencia.executeQuery();
        for (Piloto p : pilotos) {
            if (id == p.getDriverid()) {
                while (resultados.next()) {
                    int driverid = resultados.getInt("driverid");
                    String code = resultados.getString("code");
                    String forename = resultados.getString("forename");
                    String surname = resultados.getString("surname");
                    Date dob = resultados.getDate("dob");
                    String nationality = resultados.getString("nationality");
                    int constructorid = resultados.getInt("constructorid");
                    String url = resultados.getString("url");
                    System.out.println("personas: " + driverid + ", " + code + ", " + forename + ", " + surname + ", " + dob + ", " + nationality + ", " + constructorid + ", " + url);
                }
            }
        }
    }

    public static void leerPilotos(PreparedStatement sentencia) throws SQLException {

        ResultSet resultados = sentencia.executeQuery();

        while (resultados.next()) {
            int driverid = resultados.getInt("driverid");
            String code = resultados.getString("code");
            String forename = resultados.getString("forename");
            String surname = resultados.getString("surname");
            Date dob = resultados.getDate("dob");
            String nationality = resultados.getString("nationality");
            int constructorid = resultados.getInt("constructorid");
            String url = resultados.getString("url");
            System.out.println("personas: " + driverid + ", " + code + ", " + forename + ", " + surname + ", " + dob + ", " + nationality + ", " + constructorid + ", " + url);
        }
    }

    public static void actualizarPiloto(PreparedStatement sentencia, Piloto piloto, List<Piloto> pilotos) throws SQLException {

        ResultSet resultados = sentencia.executeQuery();
        for (Piloto p : pilotos) {
            if (piloto.getDriverid() == p.getDriverid()) {
                sentencia.setString(1, piloto.getCode());
                sentencia.setString(2, piloto.getForename());
                sentencia.setString(3, piloto.getSurname());
                sentencia.setDate(4, (Date) piloto.getDob());
                sentencia.setString(5, piloto.getNacionality());
                sentencia.setInt(6, piloto.getConstuctorid());
                sentencia.setString(7, piloto.getUrl());
                sentencia.setInt(8, piloto.getDriverid());
                sentencia.executeUpdate();
            }
        }

        System.out.println("Piloto actualizado correctamente");
    }

    public static void borrarPiloto(PreparedStatement sentencia, Piloto piloto, List<Piloto> pilotos) throws SQLException {

        for (Piloto p : pilotos) {
            if (piloto.getDriverid() == p.getDriverid()) {
                sentencia.setInt(1, piloto.getDriverid());
                pilotos.remove(piloto);
                sentencia.executeUpdate();
            }
        }

        System.out.println("Piloto eliminado correctamente");
    }

    public static void mostrarClasificacionPiloto(PreparedStatement sentencia) throws SQLException {

        ResultSet resultados = sentencia.executeQuery();
        while (resultados.next()){
            System.out.println(resultados.getString("code") + " " + resultados.getInt("points"));
        }
    }

    public static void mostrarClasificacionConstructores(PreparedStatement sentencia) throws SQLException {

        ResultSet resultados = sentencia.executeQuery();
        while (resultados.next()){
            System.out.println(resultados.getString("name") + " " + resultados.getInt("Puntos"));
        }
    }

}

