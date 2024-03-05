package Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author francisuwu252
 */
public class lista_datos {

    public static boolean anadirTexto;
    private ArrayList libro;

    public lista_datos() {
        this.libro = new ArrayList();
    }

    public lista_datos(ArrayList libro) {
        this.libro = libro;
    }


    public boolean anadirTexto(ArrayList libro , String texto) {
        boolean insertado = false;
        if (libro != null) {
            insertado = libro.add(texto);
            insertado=true;
        }
        return insertado;

    }


}

