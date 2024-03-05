package Principal;

import java.util.*;
public class Book {

    ArrayList<String> lista;

    private int paginas ;
    private String titulo;
    private String autor;

    public Book(int paginas , String titulo , String autor){

        this.paginas=paginas;
        this.titulo=titulo;
        this.autor=autor;

    }

    public int getPaginas() {
        return paginas;
    }

    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public  Book() {
        lista = new ArrayList<>();
    }

    public void incluir(String texto) {
        lista.add(texto);
    }

    public boolean contiene(String texto) {
        return lista.contains(texto);
    }

    public void mostrarDatosOrdenados() {
        Collections.sort(lista);
        System.out.println(lista);
    }


}
