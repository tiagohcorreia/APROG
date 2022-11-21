package Modularizacao.problemas;

import java.util.Scanner;

public class Problema06 {

    //Ler a idade, o peso e a altura de uma pessoa. Considerar apenas válidos
    //valores dentro dos intervalos: idade=[0,120]; peso=[100g,300000g]; altura=[30cm,250cm];

    public static void main(String[] args) {

        int idade = lerInteiroNoIntervalo(0, 120);     //Há reutilização do código
        int peso = lerInteiroNoIntervalo(100, 300000);  //Parâmetros distintos para usos diferentes
        int altura = lerInteiroNoIntervalo(30, 250);
    }

    public static int lerInteiroNoIntervalo(int lim1, int lim2) {   //método já existente


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



