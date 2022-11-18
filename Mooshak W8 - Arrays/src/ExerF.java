import java.util.Scanner;

public class ExerF {
    static Scanner ler = new Scanner(System.in);
    static final int MESES = 6;
    static double[] juros = new double[MESES];

    public static void main(String[] args) {

        lerJuros();

        double deposito = ler.nextDouble();

        System.out.printf("final value=%.2f%n", calcularMontanteFinal(deposito));

    }

    public static double[] lerJuros() {

        for (int i = 0; i < MESES; i++) {

            juros[i] = ler.nextDouble();
        }
        return juros;

    }
    public static double calcularMontanteFinal(double valorInicial) {

        double montanteFinal = valorInicial;

        for (int i = 0; i < MESES; i++) {

            montanteFinal += (montanteFinal * juros[i]);
        }

        return montanteFinal;
    }


}
