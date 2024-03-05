import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {


        int num;
        String [] meses= new String[12];

        meses[0]="Enero";
        meses[1]="Febrero";
        meses[2]="Marzo";
        meses[3]="Abril";
        meses[4]="Mayo";
        meses[5]="Junio";
        meses[6]="Julio";
        meses[7]="Agosto";
        meses[8]="Septiembre";
        meses[9]="Octubre";
        meses[10]="Noviembre";
        meses[11]="Diciembre";
        Scanner entrada = new Scanner(System.in);



        System.out.printf("Dime un mes en numero y te dire el nombre\n");

        do {
            num = entrada.nextInt();

            if (num < 1 ||  num>12) {

                System.out.println("El numero tien que estar entre 1 y 12\nEscribe un numero correcto");
            }
        }while(num<1||num>12);


            System.out.println(meses[num-1]);

    }
}
