package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int opcion;
        String resp;
        List<Book> libros = new ArrayList();


        Book libro1=new Book("1","El Principito","Antuane","1994","400");
        Book libro2=new Book("2","El Principito2","Antuane","1995","401");
        Book libro3=new Book("3","El Principito3","Antuane","1996","403");
        Book libro4=new Book("4","El Principito4","Antuane","1997","404");
        Book libro5=new Book("5","El Principito5","Antuane","1998","405");
        Book libro6=new Book("6","El Principito6","Antuane","1999","406");
        Book libro7=new Book("7","El Principito7","Antuane","1993","407");
        Book libro8=new Book("8","El Principito8","Antuane","1991","408");

        libros.add(new Book(libro1.getIsbn(),libro1.getTitulo(),libro1.getAutor(),libro1.getAño_publicacion(),libro1.getNum_paginas()));
        libros.add(new Book(libro2.getIsbn(),libro2.getTitulo(),libro2.getAutor(),libro2.getAño_publicacion(),libro2.getNum_paginas()));
        libros.add(new Book(libro3.getIsbn(),libro3.getTitulo(),libro3.getAutor(),libro3.getAño_publicacion(),libro3.getNum_paginas()));
        libros.add(new Book(libro4.getIsbn(),libro4.getTitulo(),libro4.getAutor(),libro4.getAño_publicacion(),libro4.getNum_paginas()));
        libros.add(new Book(libro5.getIsbn(),libro5.getTitulo(),libro5.getAutor(),libro5.getAño_publicacion(),libro5.getNum_paginas()));
        libros.add(new Book(libro6.getIsbn(),libro6.getTitulo(),libro6.getAutor(),libro6.getAño_publicacion(),libro6.getNum_paginas()));
        libros.add(new Book(libro7.getIsbn(),libro7.getTitulo(),libro7.getAutor(),libro7.getAño_publicacion(),libro7.getNum_paginas()));
        libros.add(new Book(libro8.getIsbn(),libro8.getTitulo(),libro8.getAutor(),libro8.getAño_publicacion(),libro8.getNum_paginas()));

        Path ficheroJson = Path.of(".","src", "main", "resources", "libros.json");

        Metodos.escribirListaObjetosJson(libros,ficheroJson);

        System.out.println(Metodos.leerObjetoJson(libros));

        do {

            System.out.println("-------------------------------------------Menu------------------------------------------");
            System.out.println("----   Opcion 1 : Buscar libro por titulo o isbn .                                   ----");
            System.out.println("----   Opcion 2 : Agregar nuevo libro.                                               ----");
            System.out.println("----   Opcion 3 : Lista de todos los libros.                                         ----");
            System.out.println("----   Opcion 4 : Salir .                                                            ----");
            System.out.println("-----------------------------------------------------------------------------------------");

            System.out.println("Elige una opcion");

            do {

                opcion = sc.nextInt();

                if (opcion < 1 || opcion > 4) {

                    System.err.println("Opcion incorrecta . Elige una opcion valida");
                }

            } while (opcion < 1 || opcion > 4);


            switch (opcion) {

                case 1:

                    do {


                        System.out.println("Quieres buscar un libro?\nEscribe si o no");
                        resp = sc.nextLine();
                        resp = sc.nextLine();
                    }while(!(resp.equalsIgnoreCase("si")||resp.equalsIgnoreCase("no")));

                    if (resp.equalsIgnoreCase("si")) {

                        Metodos.encontrarLibro(libros);
                    }else{System.out.println("No se buscara ningun libro");}

                    break;

                case 2:

                    Metodos.agregarLibro(libros);



                    break;

                case 3:

                    Metodos.listaTodosLibros(libros);

                    break;

                case 4:

                    System.out.println("Fin del programa");

                    break;
            }

        } while (opcion != 4);

    }
}