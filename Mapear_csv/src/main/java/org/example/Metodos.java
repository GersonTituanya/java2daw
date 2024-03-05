package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Metodos implements Serializable{

    public static void funkoMasCaro(List<Funkos> lista) {


        List<Funkos> funko = lista.stream()
                .sorted((l1, l2) -> Double.compare(l2.getPrecio(), l1.getPrecio()))
                .sorted(Comparator.comparingDouble(Funkos::getPrecio).reversed())
                .limit(1)
                .toList();

        System.out.println(funko);

    }

    public static void mediaPrecio(List<Funkos> lista) {


        double media = lista.stream().mapToDouble(Funkos::getPrecio).average().getAsDouble();

        System.out.println("El precio medio de todos los funkos es "+media);

    }


    public static void agruparPorModelos(List<Funkos> lista) {


        List<Funkos> funko = lista.stream()
                .sorted(Comparator.comparing(Funkos::getModelo))
                .toList();

        System.out.println(funko);
    }


    public static void numFunkoPorModelos(List<Funkos> lista) {

        List<String> nombre=lista.stream().collect(Collectors.groupingBy(Funkos::getModelo, Collectors.counting()))
                .entrySet().stream()
                .map(Map.Entry::getKey).toList();

        List<Long> num_funkos=lista.stream().collect(Collectors.groupingBy(Funkos::getModelo, Collectors.counting()))
                .entrySet().stream()
                .map(Map.Entry::getValue).toList();

        System.out.println(nombre);
        System.out.println(num_funkos);
    }


    public static void funkosLanzados2023(List<Funkos> lista) {

        List<Funkos> funko = lista.stream()
                .filter(l->l.getFecha_lanzamiento().contains("2023"))
                .toList();

        System.out.println(funko);
    }


    public static boolean serializar(List<Funkos> lista) {
        boolean serializado = false;
        try(FileOutputStream fos = new FileOutputStream(Path.of(".", "src", "main", "resources", "funkos.dat").toString());
            //Serializar el objeto colecciondeFunkos
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(lista);
            serializado = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return serializado;
    }

    public static void desserializar(List<Funkos> lista){
        
        try(FileInputStream fis = new FileInputStream(Path.of(".", "src", "main", "resources", "funkos.dat").toString());
            //Serializar el objeto colecciondeFunkos
            ObjectInputStream ois = new ObjectInputStream(fis)){
            lista = (List<Funkos>) ois.readObject();
            //muestro los funkos para comprobar que se han deserializado bien
            lista.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
