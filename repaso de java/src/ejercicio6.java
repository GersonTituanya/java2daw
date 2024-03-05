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
public class ejercicio6 {


    public static void main(String[] args) {

        ArrayList numeros = new ArrayList();

        int num=0;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Escribe numeros positivos para guardarlos , para parar escribe un numero negativo");


        while(num>=0){

            num=entrada.nextInt();

            if(num>=0){
                numeros.add(num);
            }
        }

        num=0;
        System.out.println("Escribe numeros positivos para saber si estan en la lista , para parar escribe un numero negativo");

        while(num>=0){

            num=entrada.nextInt();

            if(num>=0){

                if(numeros.contains(num)){

                    System.out.println("El numero "+num+" esta en la lista");
                }else System.out.println("El numero "+num+" no esta en la lista");
            }
        }


        Collections.sort(numeros);

        for(int i=0 ;i<numeros.size();i++) {


            System.out.println(numeros.get(i));
        }

    }


}
