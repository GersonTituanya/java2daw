package Principal;

import java.util.*;
import java.util.stream.Collectors;


public class BookCollection {

    public static void cantidadMasQuinientos(ArrayList<Book2> lista) {

        int numLibros = (int) lista.stream()
                .filter(libro -> libro.getPaginas() > 500).count();

        System.out.println(numLibros);
    }


    public static void cantidadMenosTrescientos(ArrayList<Book2> lista) {

        int numLibros = (int) lista.stream()
                .filter(libro -> libro.getPaginas() < 300).count();

        System.out.println(numLibros);
    }


    public static void listarTitulosCantidadMasQuinientos(ArrayList<Book2> lista) {

        List<String> titulos = lista.stream()
                .filter(libro -> libro.getPaginas() > 500)
                .map(libro -> libro.getTitulo())
                .toList();

        System.out.println(titulos);

    }


    public static void titulosTresMasPaginas(ArrayList<Book2> lista) {

        lista.stream()
                .sorted((l1, l2) -> Integer.compare(l2.getPaginas(), l1.getPaginas()))
                .sorted(Comparator.comparingInt(Book2::getPaginas).reversed())
                .limit(3)
                .forEach(l -> System.out.println(l.getTitulo()));
    }


    public static void sumaTotalPaginas(ArrayList<Book2> lista) {

        int totalpaginas = lista.stream().mapToInt(Book2::getPaginas).sum();
        System.out.println("El total de páginas es de " + totalpaginas);


    }


    public static void mayorPromedio(ArrayList<Book2> lista) {

        double media = lista.stream().mapToInt(Book2::getPaginas).average().getAsDouble();

        lista.stream()
                .filter(l -> l.getPaginas() > media)
                .forEach(l -> System.out.println(l.getTitulo()));

    }


    public static void obtenerTodosAutores(ArrayList<Book2> lista) {

        lista.stream().map(Book2::getAutor).distinct().forEach(System.out::println);
    }


    public static void autoresMasUnLibro(ArrayList<Book2> lista) {

        lista.stream().collect(Collectors.groupingBy(Book2::getAutor, Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey).forEach(System.out::println);
    }


    public static void libroMayorNumPaginas(ArrayList<Book2> lista) {

        System.out.println(lista.stream().max(Comparator.comparingInt(Book2::getPaginas)).get().getTitulo());

    }


    public static void obtenerTodosTitulos(ArrayList<Book2> lista) {

        List<String> titulos = lista.stream().map(Book2::getTitulo).toList();
        System.out.println(titulos);
    }

}
