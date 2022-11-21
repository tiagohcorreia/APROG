package Arrays.problemas;

import java.util.Scanner;

public class Problema02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numeros[] = new int[20];
        int num, qtdNumeros, soma;

        qtdNumeros = 0;

        num = ler.nextInt();

        while(num >= 0) {

            numeros[qtdNumeros] = num;
            qtdNumeros += 1;
            num = ler.nextInt();
        }

        soma = 0;

        for(int indice = 0; qtdNumeros < 1;) {

            soma = soma + numeros[indice];

        }
        System.out.println(soma/qtdNumeros);


    }
}
