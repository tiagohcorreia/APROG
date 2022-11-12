import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int divisor;
        int cont = 0;


        numero = ler.nextInt();

        if (numero > 0) {

            for (divisor = 2; divisor < numero; divisor++) {

                if (numero % divisor == 0) {
                    cont++;

                }
            }
        }

        if (cont == 0 && numero != 1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }


    }
}
