package Modularizacao.exemplos;

public class Exemplo1 {

    public static void main(String[] args) {

        int c = 0;
        metodo(c);
        System.out.println("C=" + c);
    }

    private static void metodo(int c) {
        c = 1;
    }
} // Programa escreve C=0



