package Principal;

import java.util.*;

import static  Principal.BookCollection.*;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList lista1 = new ArrayList();

        int opcion;

        do{

            System.out.println("---------------------------------------------------------------Menu-----------------------------------------------------");
            System.out.println("----   Opcion 1 : Obtener la cantidad de libros con más de 500 páginas.                                             ----");
            System.out.println("----   Opcion 2 : Obtener la cantidad de libros con menos de 300 páginas.                                           ----");
            System.out.println("----   Opcion 3 : Listar el título de todos aquellos libros con más de 500 páginas.                                 ----");
            System.out.println("----   Opcion 4 : Listar el título de los tres libros con mayor numero de paginas.                                  ----");
            System.out.println("----   Opcion 5 : Obtener la suma total de las páginas de todos los libros.                                         ----");
            System.out.println("----   Opcion 6 : Obtener todos aquellos libros que superen el promedio en cuanto a número de páginas se refiere.   ----");
            System.out.println("----   Opcion 7 : Obtener los autores de todos los libros, sin repetir nombres de autores.                          ----");
            System.out.println("----   Opcion 8 : Obtener los autores que tengan más de 1 libro listado.                                            ----");
            System.out.println("----   Opcion 9 : Obtener el libro con mayor número de páginas.                                                     ----");
            System.out.println("----   Opcion 10 : Obtener una colección con todos los títulos de los libros.                                       ----");
            System.out.println("----   Opcion 11 : Salir                                                                                            ----");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");

            System.out.println("Elige una opcion");

            do{

                opcion=entrada.nextInt();

                if(opcion<1||opcion>11){

                    System.err.println("Opcion incorrecta . Elige una opcion valida");
                }

            }while(opcion<1||opcion>11);


            switch (opcion){

                case 1 :

                    System.out.println("Cantidad de libros con mas de 500 paginas : "); cantidadMasQuinientos(lista1);

                    break;

                case 2 :

                    System.out.println("Cantidad de libros con menos de 300 paginas :"); cantidadMenosTrescientos(lista1);

                    break;

                case 3 :

                    listarTitulosCantidadMasQuinientos(lista1);

                    break;

                case 4 :

                    titulosTresMasPaginas(lista1);

                    break;

                case 5 :

                    sumaTotalPaginas(lista1);

                    break;

                case 6 :

                    mayorPromedio(lista1);

                    break;

                case 7 :

                    obtenerTodosAutores(lista1);

                    break;

                case 8 :

                    autoresMasUnLibro(lista1);

                    break;

                case 9 :

                    libroMayorNumPaginas(lista1);

                    break;

                case 10 :

                    obtenerTodosTitulos(lista1);

                    break;

                case 11 :

                    System.out.println("Fin del programa");

                    break;
            }

        }while(opcion!=11);

    }


}