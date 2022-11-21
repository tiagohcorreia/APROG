package Modularizacao.exemplos;

import java.util.Scanner;

// Ler uma frase e mostrar quantas vogais, vírgulas e pontos de interrogação existem nessa frase.

public class Exemplo4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String frase = ler.nextLine();

        System.out.println("Vogais=" + contarVogaisNaFrase(frase));
        System.out.println("Vírgulas=" + contarOcorrenciasDoSimbolo(frase, ','));
        System.out.println("Pontos de interrogação=" + contarOcorrenciasDoSimbolo(frase,'?'));

    }
    public static int contarVogaisNaFrase(String frase){

        return contarOcorrenciasDoSimbolo(frase, 'a')+
                contarOcorrenciasDoSimbolo(frase, 'e')+
                contarOcorrenciasDoSimbolo(frase, 'i')+
                contarOcorrenciasDoSimbolo(frase, 'o')+
                contarOcorrenciasDoSimbolo(frase, 'u');
    }
    public static int contarOcorrenciasDoSimbolo(String frase, char simbolo){

        int qtd=0;

        for(int i=0; i<frase.length(); i++){

            if(frase.charAt(i) == simbolo) {

                qtd++;
            }
        }
        return qtd;
    }
}
