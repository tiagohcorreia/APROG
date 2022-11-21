package Modularizacao.problemas;

public class Problema08 {

    //: Quantas vezes surge o algarismo 3 entre os números 100 e 1000?

    public static void main(String[] args) {

        System.out.println(contarAlgarismoNoIntervalo(3, 100, 140));
    }
    public static int contarAlgarismoNoIntervalo(int algarismo, int lim1, int lim2) { //Intervalo de pesquisa definido pelos parâmetros

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

            if (num == algarismo) {  //Algarismo a comparar definido por parâmetro

                qtd++;
            }
        }
        return qtd;
    }

}
