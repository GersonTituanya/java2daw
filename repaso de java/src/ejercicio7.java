
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francisuwu252
 */
public class ejercicio7 {


    public static void main(String[] args) {

        ArrayList libro = new ArrayList();

        String texto="" , parar , resp;

        parar=" fin";
        Scanner entrada = new Scanner(System.in);




        do{
            do{

                System.out.println("Escribe texto para guardarlo , para parar escribe fin");

                texto=entrada.nextLine();


                libro.add(texto);

            }while(!(texto.substring(texto.length()-4).equals(parar)));

            System.out.println("Quieres mirar otro texto Â¿?");

            resp=entrada.nextLine();

            while(!(resp.equalsIgnoreCase("si"))&&!(resp.equalsIgnoreCase("no"))){

                System.out.println("Escribe si o no ");

                resp=entrada.nextLine();
            }

        }while("si".equals(resp));

        texto="";
        System.out.println("Escribe textos para saber si estan en la lista , para parar escribe fin");

        do{

            do{

                texto=entrada.nextLine();



                if(libro.contains(texto)){

                    System.out.println("El texto "+texto+" esta en la lista");
                }else System.out.println("El texto "+texto+" no esta en la lista");

            }while(!(texto.substring(texto.length()-4).equals(parar)));

            System.out.println("Quieres escribir otro texto Â¿?");

            resp=entrada.nextLine();

            while(!(resp.equalsIgnoreCase("si"))&&!(resp.equalsIgnoreCase("no"))){

                System.out.println("Escribe si o no ");

                resp=entrada.nextLine();
            }

        }while("si".equals(resp));

        Collections.sort(libro);

        for(int i=0 ;i<libro.size();i++) {


            System.out.println(libro.get(i));
        }

    }


}

