import java.util.Scanner;

public class ExerH {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int n = ler.nextInt();

        int[] valores = lerValores(n);

        ler.nextLine();

        String opcao = ler.nextLine();

        while(!opcao.equals("exit")) {

            switch (opcao) {

                case "left":

                    tracarParaLeft(valores);
                    mostrarValores(valores);
                    break;

                case "right":

                    trocarParaRight(valores);
                    mostrarValores(valores);
                    break;

            }
            opcao = ler.nextLine();

        }

    }
    public static int[] lerValores(int n) {

        int[] valores = new int[n];

        for (int i = 0; i < valores.length; i++) {

            valores[i] = ler.nextInt();
        }
        return valores;
    }

    public static void trocarParaRight(int[] valores) {

        int valor = valores[valores.length - 1];

        for (int i = valores.length - 1; i > 0; i--) {

            valores[i] = valores[i - 1];
        }
        valores[0] = valor;
    }

    public static void tracarParaLeft(int[] valores) {

        int valor = valores[0];

        for (int i = 0; i < valores.length - 1; i++) {

            valores[i] = valores[i + 1];
        }
        valores[valores.length - 1] = valor;
    }

    public static void mostrarValores(int[] valores) {

        for (int i = 0; i < valores.length; i++) {

            System.out.printf("[%d]", valores[i]);

        }
        System.out.println();
    }
}
