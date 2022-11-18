import java.util.Scanner;

public class ExerA {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        double[] arr = lerNotas();

        System.out.printf("average=%.1f%n", calcularMedia(arr));
        System.out.printf("failures=%d%n", contarReprovacao(arr));

    }

    public static double[] lerNotas() {

        int n = ler.nextInt();
        double arr[] = new double[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = ler.nextDouble();
        }
        return arr;

    }

    public static double calcularMedia(double[] arr) {

        double media = 0.0;
        double soma = 0.0;

        for(int i = 0; i < arr.length; i++) {

            soma += arr[i];

        }
        media = soma / arr.length;
        return media;

    }

    public static int contarReprovacao(double[] arr) {

        int contador = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < 10) {
                contador++;
            }
        }

        return contador;
    }

}
