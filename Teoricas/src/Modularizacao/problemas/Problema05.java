package Modularizacao.problemas;

import java.util.Scanner;

public class Problema05 {

    // Ler a idade de uma pessoa. Considerar apenas o intervalo [0,120];

    public static void main(String[] args) {

        int idade = lerInteiroNoIntervalo(0, 120);

        System.out.println("Idade=" + idade);
    }

    public static int lerInteiroNoIntervalo(int lim1, int lim2) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Numero:[" + lim1 + "," + lim2 + "]:");

        numero = ler.nextInt();

        while (numero < lim1 || numero > lim2) {

            System.out.println("Numero:[" + lim1 + "," + lim2 + "]:");
            numero = ler.nextInt();
        }
        return numero;
    }


}

