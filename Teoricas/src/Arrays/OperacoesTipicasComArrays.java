package Arrays;

import java.util.Scanner;

public class OperacoesTipicasComArrays {

    public static void main(String[] args) {

        //Criar array
        double[] arr = new double[15];

        //=============================================================================================================

        //Ler valores para o array
        Scanner ler = new Scanner(System.in);
        for (int indice = 0; indice < arr.length; indice++) {

            arr[indice] = ler.nextDouble();
        }

        //=============================================================================================================

        //Imprimir os elementos do array
        for (int indice = 0; indice < arr.length; indice++) {

            System.out.println(arr[indice]);

        }

        //=============================================================================================================

        //Calcular a média dos elementos do array
        double soma = 0.0;

        for (int indice = 0; indice < arr.length; indice++) {
            soma += arr[indice];
            double media = soma / arr.length;
        }

        //=============================================================================================================

        //Preencher o array com valores aleatórios
        for (int indice = 0; indice < arr.length; indice++) {

            arr[indice] = Math.random();
        }

        //============================================================================================================

        //Encontrar o maior elemento do array
        double maior = arr[0];

        for (int indice = 1; indice < arr.length; indice++) {

            if (arr[indice] > maior) {

                maior = arr[indice];
            }

        }

        //=============================================================================================================

        //Inverter a ordem dos elementos do array
        for (int idx1 = 0, idx2 = arr.length - 1; idx1 < idx2; idx1++, idx2--) {

            double aux = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = aux;
        }

        //=============================================================================================================

        //Copiar os elementos do array para um novo array
        double[] novoArr = new double[arr.length];

        for (int indice = 0; indice < arr.length; indice++) {

            novoArr[indice] = arr[indice];
        }

        //=============================================================================================================

        //ler um array

        /*public static int[] lerVetor(double arr1) {

            int n = ler.nextInt();
            int arr1[] = new int[n];

            for (int i = 0; i < arr.length - 1; i++) {

                arr[i] = ler.nextInt();

            }

        }

        //=============================================================================================================

        //Ler uma matriz
        public static String[][] proprietarios() {

            String[][] proprietarios = new String[3][4];

            for(int idx1 = 0; idx1 < proprietarios.length; idx1++) {

                for(int idx2 = 0; idx2 < proprietarios[idx1].length; idx2++) {

                    proprietarios[idx1][idx2] = ler.nextLine();
                }
            }
            return proprietarios;
        }

        //=============================================================================================================

        //Encontrar elemento no array
        public static void encontrarProprietario(String[][] proprietarios){
            boolean encontrado = false;
            String proprietario = ler.nextLine();
            for (int i = 0; i < proprietarios.length; i++){
                for(int j = 0; j < proprietarios[i].length; j++){
                    if (proprietario.equals(proprietarios[i][j])){
                        encontrado = true;
                        System.out.println("nome=" + proprietario);
                        System.out.println("entrada=" + i);
                        System.out.println("piso=" + j);
                    }
                }

            } */


        //===============================================================================================================

        //Ordenação de array
        for (int i = 0; i < n - 1 ; i++) {
            for (int j + 1 = 0; j + 1 < n ; j++) {

                if(||){  //vec[i].compareTo(vec[j] <0)

                }
            }

            }
        }

}
