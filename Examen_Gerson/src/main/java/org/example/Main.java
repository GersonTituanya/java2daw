package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Main {
    private final static String COMMA_DELIMITER = ";";

    public static void main(String[] args) {

        List<OscarAgeAtributos> PeliculaOscarizada_Female = new ArrayList();
        List<OscarAgeAtributos> PeliculaOscarizada_Male = new ArrayList();
        List<OscarAgeAtributos> PeliculaOscarizada = new ArrayList();
        List<PeliculaOscarizada> PeliculaOscarizada_2 = new ArrayList();
        List<Actor> Actores = new ArrayList();


        try (Stream<String> contenidoFichero_Female = Files.lines(Path.of(".", "src", "main", "resources", "oscar_age_female.csv"))) {

            PeliculaOscarizada_Female =  contenidoFichero_Female.map(l-> Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l-> new OscarAgeAtributos(l.get(0),l.get(1),l.get(2), l.get(3),l.get(4))).toList();


        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        try (Stream<String> contenidoFichero_Male = Files.lines(Path.of(".", "src", "main", "resources", "oscar_age_male.csv"))) {

            PeliculaOscarizada_Male =  contenidoFichero_Male.map(l-> Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l-> new OscarAgeAtributos(l.get(0),l.get(1),l.get(2), l.get(3),l.get(4))).toList();


        } catch (IOException e) {
            e.printStackTrace(System.out);
        }



        Path ficheroCSV = Path.of(".","src", "main", "resources", "PeliculasOscarizadas.csv");

            for (OscarAgeAtributos b : PeliculaOscarizada_Female) {

                PeliculaOscarizada.add(b);
            }

        for (OscarAgeAtributos b : PeliculaOscarizada_Male) {

            PeliculaOscarizada.add(b);
        }



            Utilidades.escribirListaObjetosCSV(PeliculaOscarizada,ficheroCSV);

            PeliculaOscarizada_2 = Utilidades.leerPeliculasOscarizadasCsv(PeliculaOscarizada,PeliculaOscarizada_Female,PeliculaOscarizada_Male);

            Actores=Utilidades.convertirPeliculasOscarizadasEnActores(PeliculaOscarizada_2);


        Path ficheroJson = Path.of(".","src", "main", "resources", "Salida" , "Actores.json");

        Utilidades.escribirActoresenJson(Actores,ficheroJson);

    }
}