package org.example;



    import java.util.*;
import java.util.stream.Collectors;


    public class BookCollection {

        private final List<Book> books;
        public BookCollection(Book[] books) {
            this.books = Arrays.asList(books);
        }
        public List<Book> find(String textToFind) {
            List<Book> foundBooks = new ArrayList<>();
            for(Book book : this.books){
                if(book.getISBN().equals(textToFind) ||
                        book.getTitulo().contains(textToFind)){
                    foundBooks.add(book);
                }
            }
            Pruebas.shouldGetAnEmptyListIfNoMatchesAreFound(textToFind , books);
           Pruebas.shouldNotFindIfCollectionIsEmpty(foundBooks);

            return foundBooks;
        }

        public static void cantidadMasQuinientos(ArrayList<Book> lista) {

            int numLibros = (int) lista.stream()
                    .filter(libro -> libro.getPaginas() > 500).count();

            System.out.println(numLibros);
        }


        public static void cantidadMenosTrescientos(ArrayList<Book> lista) {

            int numLibros = (int) lista.stream()
                    .filter(libro -> libro.getPaginas() < 300).count();

            System.out.println(numLibros);
        }


        public static void listarTitulosCantidadMasQuinientos(ArrayList<Book> lista) {

            List<String> titulos = lista.stream()
                    .filter(libro -> libro.getPaginas() > 500)
                    .map(libro -> libro.getTitulo())
                    .toList();

            System.out.println(titulos);

        }


        public static void titulosTresMasPaginas(ArrayList<Book> lista) {

            lista.stream()
                    .sorted((l1, l2) -> Integer.compare(l2.getPaginas(), l1.getPaginas()))
                    .sorted(Comparator.comparingInt(Book::getPaginas).reversed())
                    .limit(3)
                    .forEach(l -> System.out.println(l.getTitulo()));
        }


        public static void sumaTotalPaginas(ArrayList<Book> lista) {

            int totalpaginas = lista.stream().mapToInt(Book::getPaginas).sum();
            System.out.println("El total de páginas es de " + totalpaginas);


        }


        public static void mayorPromedio(ArrayList<Book> lista) {

            double media = lista.stream().mapToInt(Book::getPaginas).average().getAsDouble();

            lista.stream()
                    .filter(l -> l.getPaginas() > media)
                    .forEach(l -> System.out.println(l.getTitulo()));

        }


        public static void obtenerTodosAutores(ArrayList<Book> lista) {

            lista.stream().map(Book::getAutor).distinct().forEach(System.out::println);
        }


        public static void autoresMasUnLibro(ArrayList<Book> lista) {

            lista.stream().collect(Collectors.groupingBy(Book::getAutor, Collectors.counting()))
                    .entrySet().stream()
                    .filter(m -> m.getValue() > 1)
                    .map(Map.Entry::getKey).forEach(System.out::println);
        }


        public static void libroMayorNumPaginas(ArrayList<Book> lista) {

            System.out.println(lista.stream().max(Comparator.comparingInt(Book::getPaginas)).get().getTitulo());

        }


        public static void obtenerTodosTitulos(ArrayList<Book> lista) {

            List<String> titulos = lista.stream().map(Book::getTitulo).toList();
            System.out.println(titulos);
        }


}
