package org.example;

import jakarta.xml.bind.DatatypeConverter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class Main {

        private final static String COMMA_DELIMITER = ",";

        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            int opcion;
            List<Funkos> funkos =new ArrayList();
            do{

                System.out.println("-------------------------------------------Menu------------------------------------------");
                System.out.println("----   Opcion 1 : Funko mas caro .                                                   ----");
                System.out.println("----   Opcion 2 : Media de precio de funkos.                                         ----");
                System.out.println("----   Opcion 3 : Funkos agrupados por modelos.                                      ----");
                System.out.println("----   Opcion 4 : Número de funkos por modelos.                                      ----");
                System.out.println("----   Opcion 5 : Funkos que han sido lanzados en 2023                               ----");
                System.out.println("----   Opcion 6 : Salir .                                                            ----");
                System.out.println("-----------------------------------------------------------------------------------------");

                System.out.println("Elige una opcion");

                do{

                    opcion=sc.nextInt();

                    if(opcion<1||opcion>6){

                        System.err.println("Opcion incorrecta . Elige una opcion valida");
                    }

                }while(opcion<1||opcion>6);


                switch (opcion){

                    case 1 :



                        // Lectura de ficheros CSV con Files.lines en java.nio
                        try (Stream<String> contenidoFichero = Files.lines(Path.of(".", "src", "main", "resources", "funkos.csv"))) {

                            funkos =  contenidoFichero.map(l->Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l-> new Funkos(l.get(0),l.get(1),l.get(2), Double.parseDouble(l.get(3)),l.get(4))).toList();

                            Metodos.funkoMasCaro(funkos);


                        } catch (IOException e) {
                            e.printStackTrace(System.out);
                        }

                        break;

                    case 2 :


                        try (Stream<String> contenidoFichero = Files.lines(Path.of(".", "src", "main", "resources", "funkos.csv"))) {

                            funkos =  contenidoFichero.map(l->Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l-> new Funkos(l.get(0),l.get(1),l.get(2), Double.parseDouble(l.get(3)),l.get(4))).toList();

                            Metodos.mediaPrecio(funkos);


                        } catch (IOException e) {
                            e.printStackTrace(System.out);
                        }

                        break;

                    case 3 :

                        try (Stream<String> contenidoFichero = Files.lines(Path.of(".", "src", "main", "resources", "funkos.csv"))) {

                            funkos =  contenidoFichero.map(l->Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l-> new Funkos(l.get(0),l.get(1),l.get(2), Double.parseDouble(l.get(3)),l.get(4))).toList();

                            Metodos.agruparPorModelos(funkos);


                        } catch (IOException e) {
                            e.printStackTrace(System.out);
                        }

                        break;

                    case 4 :


                        try (Stream<String> contenidoFichero = Files.lines(Path.of(".", "src", "main", "resources", "funkos.csv"))) {

                            funkos =  contenidoFichero.map(l->Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l-> new Funkos(l.get(0),l.get(1),l.get(2), Double.parseDouble(l.get(3)),l.get(4))).toList();

                            Metodos.numFunkoPorModelos(funkos);


                        } catch (IOException e) {
                            e.printStackTrace(System.out);
                        }

                        break;

                    case 5 :

                        try (Stream<String> contenidoFichero = Files.lines(Path.of(".", "src", "main", "resources", "funkos.csv"))) {

                            funkos =  contenidoFichero.map(l->Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l-> new Funkos(l.get(0),l.get(1),l.get(2), Double.parseDouble(l.get(3)),l.get(4))).toList();

                            Metodos.funkosLanzados2023(funkos);


                        } catch (IOException e) {
                            e.printStackTrace(System.out);
                        }

                        break;

                    case 6 :


                    try (Stream<String> contenidoFichero = Files.lines(Path.of(".", "src", "main", "resources", "funkos.csv"))) {

                            funkos =  contenidoFichero.map(l->Arrays.asList(l.split(COMMA_DELIMITER))).skip(1).map(l-> new Funkos(l.get(0),l.get(1),l.get(2), Double.parseDouble(l.get(3)),l.get(4))).toList();

                        } catch (IOException e) {
                            e.printStackTrace(System.out);
                        }

                        System.out.println("Fin del programa");

                        break;
                }

            }while(opcion!=6);

            Metodos.serializar(funkos);

            Metodos.desserializar(funkos);

        }
}