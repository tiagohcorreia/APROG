package Modularizacao.problemas;

import java.util.Scanner;

//Leia um número inteiro e mostre os seus algarismos linha a linha. Mostre também quantos algarismos possui esse
//número. Desenvolva um programa adotando uma estrutura modular. Para tal crie um procedimento para mostrar os
//algarismos e uma função para calcular e retornar a quantidade de algarismos de um número inteiro.

public class Problema04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;
        numero = ler.nextInt();

        mostrarAlgarismos(numero);

        System.out.println(contarAlgarismos(numero));
    }

    public static void mostrarAlgarismos(int numero) {  //Procesimento

        int algarismo;

        while (numero > 9) {

            algarismo = numero % 10;
            System.out.println(algarismo);
            numero = numero / 10;
        }
        System.out.println(numero);
    }

    public static int contarAlgarismos(int numero) {   //Função

        int qtd = 1;

        while (numero > 9) {

            numero = numero / 10;
            qtd = qtd + 1;
        }
        return (qtd);
    }

}

