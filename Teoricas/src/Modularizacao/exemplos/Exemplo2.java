package Modularizacao.exemplos;

import java.util.Scanner;

public class Exemplo2 {

    //Ler uma frase e mostrar quantas vogais existem nessa frase.

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String frase1;
        String frase2;

        frase1 = ler.nextLine();
        frase2 = ler.nextLine();

        System.out.println("Vogais=" + contarVogaisNaFrase(frase1));    //Abstração da implementação
        System.out.println("Vogais2=" + contarVogaisNaFrase(frase2));   //Não há [Copy + Paste] do código Há reutilização do código
    }

    public static int contarVogaisNaFrase(String frase) {   //O algoritmo está num local único e não tem de ser alterado fora daqui

        int qtdVogais = 0;

        frase = frase.toLowerCase(); //passar tudo para minúsculas para não repetir

        for (int i = 0; i < frase.length(); i++) {

            switch (frase.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    qtdVogais++;
                    break;
            }
        }
        return qtdVogais;
    }
}

