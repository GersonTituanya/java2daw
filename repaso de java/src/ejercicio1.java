import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio1 {
    public static void main(String[] args) {

        String nombre;

        Scanner entrada = new Scanner(System.in);
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Dime tu nombre\n");


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < 5; i++) {

            nombre = entrada.nextLine();
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+8.
            System.out.println("Hola " + nombre);
        }
    }
}