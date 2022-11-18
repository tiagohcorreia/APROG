import java.util.Scanner;

public class ExerD {
    static Scanner ler = new Scanner(System.in);
    static final int NOTAS = 21;
    static int[] frequencia = new int[NOTAS];

    public static void main(String[] args) {

        int n = ler.nextInt();

        int[] notas = new int[n];

        notas = lerNotas(n);
        determinarFrequencias(notas, frequencia);
        escreverNotas();

    }

    public static int[] lerNotas(int n) {

        int[] notas = new int[n];

        for (int i = 0; i < n; i++) {

            notas[i] = ler.nextInt();
        }
        return notas;

    }

    public static void determinarFrequencias(int[] notas, int[] frequencias) {

        for (int j = 0; j < notas.length; j++) {

            frequencias[notas[j]] = frequencias[notas[j]] + 1;
        }
    }

    public static void escreverNotas() {

        for (int i = 0; i < frequencia.length; i++) {

            System.out.println(i + " " + frequencia[i]);

        }
    }


}
