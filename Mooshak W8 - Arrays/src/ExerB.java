import java.util.Scanner;

public class ExerB {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = new int[50];
        int nelem = lerVetor(arr);

        if (nelem > 0) {

            int menor = verificarMenorValor(arr, nelem);
            System.out.println("min=" + menor);
            System.out.println("occurrences=" + verificarNumeroDeOcorrencias(arr, menor));
            
        }

    }

    public static int lerVetor(int[] arr) {

        int num = ler.nextInt();
        int i = 0;
        while (num > 0) {

            arr[i] = num;
            i++;
            num = ler.nextInt();
        }

        return i - 1;
    }

    public static int verificarMenorValor(int arr[], int n) {

        int menor = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] < menor) {

                menor = arr[i];
            }
        }
        return menor;

    }

    public static int verificarNumeroDeOcorrencias(int arr[], int n) {

        int contador = 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] == n) {

                contador++;
            }

        }
        return contador;
    }


}
