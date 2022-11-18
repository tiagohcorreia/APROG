import java.util.Scanner;

public class ExerG {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int valores[] = lerValores();

       escreverVetor(inverterValores(valores));

    }

    public static int[] lerValores() {

        int n = ler.nextInt();
        int valores[] = new int[n];

        for (int i = 0; i < valores.length; i++) {

            valores[i] = ler.nextInt();
        }
        return valores;

    }

    public static int[] inverterValores(int valores[]) {

        for (int idx1 = 0, idx2 = valores.length - 1; idx1 < idx2; idx1++, idx2--) {

            int aux = valores[idx1];
            valores[idx1] = valores[idx2];
            valores[idx2] = aux;
        }
        return valores;
    }

    public static void escreverVetor(int valores[]) {

        for(int i = 0; i < valores.length; i++) {

            System.out.println(valores[i]);
        }

    }
}
