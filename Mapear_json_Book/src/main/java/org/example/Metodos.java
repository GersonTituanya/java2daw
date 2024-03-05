package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Metodos {


    public static void encontrarLibro(List<Book> libro){

        Scanner sc = new Scanner(System.in);

        String buscarLibro;

        System.out.println("Escribe el titulo o el isbn para encontrar el libro");

        buscarLibro= sc.nextLine();

        libro.stream()
                .filter(l->l.getIsbn().equals(buscarLibro)||l.getTitulo().equals(buscarLibro))
                .forEach(System.out::println);

    }


    public static void agregarLibro(List<Book> lista){

        Scanner sc = new Scanner(System.in);

        String isbn,titulo,autor,año_publicacion,num_paginas;
        boolean ok = false;
        List<Book>libro;

        System.out.println("Escribe un isbn , cada libro tiene que tener un isbn diferente");

        do{

            isbn=sc.nextLine();
            final String isbnFinal=isbn;
            libro = lista.stream()
                    .filter(l->l.getIsbn().equals(isbnFinal)).toList();

            if (libro.isEmpty()) {
                System.out.println("isbn valido , Añadiendo ...");
                ok=true;
            }else{
                System.out.println("isbn no valido , escribe otro");
                ok=false;
            }



        }while(!ok);


        System.out.println("Escribe un titulo");

        titulo=sc.nextLine();

        System.out.println("Escribe un autor");

        autor=sc.nextLine();

        System.out.println("Escribe un año de publicacion");

        año_publicacion=sc.nextLine();

        System.out.println("Escribe un numero de paginas");

        num_paginas=sc.nextLine();

        lista.add(new Book(isbn,titulo,autor,año_publicacion,num_paginas));
    }


    public static void listaTodosLibros(List<Book> lista) {

        List<Book> listaLibros = lista.stream().toList();

        System.out.println(listaLibros+"\n");

    }


    public static String leerObjetoJson(List<Book> lista) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            // La siguiente línea es opcional, pero hace que el JSON se muestre con formato
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            return objectMapper.writeValueAsString(lista);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribirListaObjetosJson(List<Book> lista, Path ruta) {

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
