import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        int num , op;

        Scanner entrada = new Scanner(System.in);
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Dime un mes en numero y te dire el nombre\n");

        do {
            op = entrada.nextInt();

            if (op < 1 || op > 12) {

                System.out.println("El numero tien que estar entre 1 y 12\nEscribe un numero correcto");
            }

        }while(op<1||op>12);

        switch (op){

            case 1 : System.out.println("El nombre del mes "+ op + " es Enero");
            break;

            case 2 : System.out.println("El nombre del mes "+ op + " es Febrero");
                break;

            case 3 : System.out.println("El nombre del mes "+ op + " es Marzo");
                break;

            case 4 : System.out.println("El nombre del mes "+ op + " es Abril");
                break;

            case 5 : System.out.println("El nombre del mes "+ op + " es Mayo");
                break;

            case 6 : System.out.println("El nombre del mes "+ op + " es Junio");
                break;

            case 7 : System.out.println("El nombre del mes "+ op + " es Julio");
                break;

            case 8 : System.out.println("El nombre del mes "+ op + " es Agosto");
                break;

            case 9 : System.out.println("El nombre del mes "+ op + " es Septiembre");
                break;

            case 10 : System.out.println("El nombre del mes "+ op + " es Octubre");
                break;

            case 11 : System.out.println("El nombre del mes "+ op + " es Noviembre");
                break;

            case 12 : System.out.println("El nombre del mes "+ op + " es Diciembre");
                break;
        }

    }
}
