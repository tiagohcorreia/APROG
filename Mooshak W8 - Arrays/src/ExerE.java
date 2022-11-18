import java.util.Scanner;

public class ExerE {
    static final int MAXIMOFUNCIONARIOS = 19;
    static final int MAXIMOVENCIMENTOS = 19;
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        String nomes[] = new String[MAXIMOFUNCIONARIOS];
        double vencimentos[] = new double[MAXIMOVENCIMENTOS];

        int numVencimentos = lerResultados(nomes, vencimentos);
        double media = calcularMedia(vencimentos, numVencimentos);

        salariosMenorQueAMedia(vencimentos, nomes, numVencimentos, media);

    }

    public static int lerResultados(String[] nomes, double[] venc) {

        int numVencimentos = 0;
        String nome = ler.next();

        while (!(nome.equals("end")) && numVencimentos < 20) {

            nomes[numVencimentos] = nome;

            venc[numVencimentos] = ler.nextDouble();

            numVencimentos++;

            nome = ler.next();
        }

        return numVencimentos;
    }

    public static double calcularMedia(double[] vencimentos, int numVencimentos) {

        double totSalarios = 0;
        double media = 0;

        for (int i = 0; i < numVencimentos; i++) {

            totSalarios += vencimentos[i];

        }
        media = totSalarios / numVencimentos;

        return media;
    }

    public static void salariosMenorQueAMedia(double[] vencimentos, String[] nomes, int nElementos, double media) {

        System.out.printf("%.1f%n", media);

        for (int i = 0; i < nElementos; i++) {

            if (vencimentos[i] < media) {

                System.out.println(nomes[i]);
            }
        }
    }


}
