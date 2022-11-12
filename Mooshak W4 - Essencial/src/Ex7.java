import java.util.Scanner;

public class Ex7 {                                               //Divisores de um numero
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int divisores;
        int contDiv = 0;


        numero = ler.nextInt();

        for (divisores = 1; divisores <= numero; divisores++) {

            if (numero % divisores == 0) {

                System.out.println(divisores);

                contDiv++;
            }

        }
        System.out.println("(" + contDiv + ")");


    }
}
