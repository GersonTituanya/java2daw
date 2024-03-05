import java.util.Scanner;

public class ejercicio5 {

    public static boolean esPrimo(int num){

        boolean a=false;
        int restos=0;

        for(int i=1 ;i<=num;i++) {

            if (num % i == 0) {

                restos++;
            }

            if (restos == 2) {

                a = true;

            } else a = false;

        }
        return a;
    }


    public static boolean esPalindromo(int num){

        String numString = String.valueOf(num);
        char letra;
        boolean a=false;
        letra =numString.charAt(0);
        int num2;
        num2=numString.length()-1;
        for(int i=0 ;i<numString.length();i++) {


            if (letra==numString.charAt(i)&&letra==numString.charAt(num2)){
                num2--;
                a=true;
            }else a=false;

        }
        return a;
    }


    public static void main(String[] args){

        int num ;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Dime un numero y te dire si es primo o palindromo\n");

        num = entrada.nextInt();

        if(esPrimo(num)){
            System.out.println("El numero "+num+" es primo");
        }else  {System.out.println("El numero "+num+" no es primo");}


        if(esPalindromo(num)){
            System.out.println("El numero "+num+" es palindromo");
        }else {System.out.println("El numero "+num+" no es palindromo");}




    }



}
