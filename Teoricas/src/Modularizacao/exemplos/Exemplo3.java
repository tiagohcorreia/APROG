package Modularizacao.exemplos;

import java.util.Scanner;

//Ler uma frase e mostrar quantas vogais existem nessa frase.

public class Exemplo3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String frase;
        frase = ler.nextLine();

        System.out.println("Vogais=" + contarVogaisNaFrase(frase));
    }

    public static int contarVogaisNaFrase(String frase) {     //Há reutilização do código
                                                                //A lógica de cada invocação está num local único
        return contarOcorrenciasDoSimbolo(frase, 'a') +
                contarOcorrenciasDoSimbolo(frase, 'e') +
                contarOcorrenciasDoSimbolo(frase, 'i') +
                contarOcorrenciasDoSimbolo(frase, 'o') +
                contarOcorrenciasDoSimbolo(frase, 'u');
    }

    public static int contarOcorrenciasDoSimbolo(String frase, char simbolo) {   //Criar um método mais genérico

        int qtd = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == simbolo)
                qtd++;
        }
        return qtd;
    }
}
