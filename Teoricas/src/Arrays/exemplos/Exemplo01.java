package Arrays.exemplos;

public class Exemplo01 { //Exemplo: inicializar os valores da contagem da água dos 12 meses com o valor -1

    public static void main(String[] args) {

        double[] contagemDaAguaPorMes = new double[12];

        for( int mes = 0; mes<12; mes++) {

            contagemDaAguaPorMes[ mes ] = -1; //Inicializar um array com um valor (-1)

        }

    }
}
