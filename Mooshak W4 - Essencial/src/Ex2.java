import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero, soma, digito;
        soma = 0;

        numero = ler.nextInt();

        while (numero >= 0) {

            while (numero != 0) {

                digito = numero % 10;

                if (digito % 2 == 0) {

                    soma = soma + digito;
                }
                numero = numero / 10;

            }

            System.out.println(soma);
            soma = 0;
            numero = ler.nextInt();
        }

    }
}

