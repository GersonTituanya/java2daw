package org.example;

import lombok.*;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PeliculaOscarizada {

    private String pelicula , actor ,sexo;
    private int anyo , edad ;

    public PeliculaOscarizada(String movie, String name, String year, String age) {
    }

    public PeliculaOscarizada(String movie, String name, int i, int i1) {
    }

  //  public PeliculaOscarizada(String movie, String name, void m, int anyo, int edad) {
   // }
}
