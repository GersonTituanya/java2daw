package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Utilidades {


    public static List<PeliculaOscarizada> leerPeliculasOscarizadasCsv(List<OscarAgeAtributos> lista, List<OscarAgeAtributos> lista2, List<OscarAgeAtributos> lista3) {

        List<PeliculaOscarizada> pelicula = null;
        String nombrePelicula;

        for (int i = 0; i < lista.size(); i++) {

            pelicula =  lista.stream().map(l-> (new PeliculaOscarizada(l.getMovie(),l.getName(),parseInt(l.getYear()), parseInt(l.getAge())))).toList();
nombrePelicula = lista2.stream().map(l->l.getMovie()).toString();
            if (lista2.contains(nombrePelicula)){
         //       pelicula.remove(i);
         //       pelicula =  lista.stream().map(l-> (new PeliculaOscarizada(l.getMovie(),l.getName(),l.setIndex("M"),parseInt(l.getYear()), parseInt(l.getAge())))).toList();
            }
            nombrePelicula = lista3.stream().map(l->l.getMovie()).toString();
            if (lista3.contains(nombrePelicula)){
          //      pelicula.remove(i);
          //      pelicula =  lista.stream().map(l-> (new PeliculaOscarizada(l.getMovie(),l.getName(),l.setIndex("H"),parseInt(l.getYear()), parseInt(l.getAge())))).toList();

            }
        }

        return pelicula;
    }

    public static List<Actor> convertirPeliculasOscarizadasEnActores(List<PeliculaOscarizada> lista) {

        List<Actor> actor = null;

    //    actor =  lista.stream().map(l-> (new Actor(l.getActor(),l.getSexo(),l.getEdad(),  l.getPelicula())).toList();

        return actor;

    }


    public static void escribirListaObjetosCSV(List<OscarAgeAtributos> lista, Path ruta) {

        try {
            Files.deleteIfExists(ruta);
            ObjectMapper objectMapper = new ObjectMapper();
            // La siguiente línea es opcional, pero hace que el JSON se muestre con formato
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            objectMapper.writeValue(ruta.toFile(), lista);
        } catch (IOException e) {
            System.out.println("El fichero no existe");
        }
    }


    public static void escribirActoresenJson(List<Actor> lista, Path ruta) {

        try {
            Files.deleteIfExists(ruta);
            ObjectMapper objectMapper = new ObjectMapper();
            // La siguiente línea es opcional, pero hace que el JSON se muestre con formato
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            objectMapper.writeValue(ruta.toFile(), lista);
        } catch (IOException e) {
            System.out.println("El fichero no existe");
        }
    }

}
