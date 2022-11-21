package Modularizacao.problemas;

//Quantas vezes surge o algarismo 3, 1 e 5 entre os números 100 e 1000 e o 2 e 4 entre os números 11 e 64?

public class Problema09 {

    public static void main(String[] args) {

        System.out.println(contarAlgarismoNoIntervalo(3, 100, 1000));
        System.out.println(contarAlgarismoNoIntervalo(1, 100, 1000));
        System.out.println(contarAlgarismoNoIntervalo(5, 100, 1000));
        System.out.println(contarAlgarismoNoIntervalo(2, 11, 64));
        System.out.println(contarAlgarismoNoIntervalo(4, 11, 64));
    }
    public static int contarAlgarismoNoIntervalo(int algarismo, int lim1, int lim2) {

        int qtd = 0;

        for (int numero = lim1; numero <= lim2; numero++) {

            int num = numero;

            while (num > 9) {

                int resto = num % 10;
                num = num / 10;

                if (resto == algarismo) {

                    qtd++;
                }
            }

            if (num == algarismo) {
                qtd++;
            }
        }
        return qtd;
    }



}
