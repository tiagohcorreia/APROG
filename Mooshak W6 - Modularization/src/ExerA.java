import java.util.Scanner;

public class ExerA {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        final int K = 5;
        int numero, xNumeros, num;
        double media, soma = 0;

        do {
            numero = ler.nextInt();
        } while (numero <= 0);

        xNumeros = 0;

        num = ler.nextInt();

        while ((qtDigitos(num) < numero) && xNumeros <= K) {

            soma = soma + num;

            xNumeros++;

            num = ler.nextInt();
        }

        if (xNumeros > 0) {

            media = soma / xNumeros;

        } else {
            media = soma;
        }

        System.out.printf("%.2f\n", media);

    }

    public static int qtDigitos(int num) {

        int qtDig = 0;

        while (num > 0) {

            num = num / 10;
            qtDig++;
        }
        return qtDig;
    }
}
