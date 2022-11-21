package Arrays.problemas;

public class Problema03 {

    //Implemente um método que crie e retorne um array preenchido com números
    //aleatórios. O tamanho do array é passado por parâmetro ao método

    public static void main(String[] args) {

        double[] arr;

        arr = gerarArrayComNumerosAleatorios(10);
    }
    public static double[] gerarArrayComNumerosAleatorios(int tamanho) {

        double[] arrResultado = new double[tamanho];    //criar array

        for (int indice = 0; indice < tamanho; indice++) { // preencher array

            arrResultado[indice] = Math.random();
        }
        return arrResultado;    //retornar array
    }

}
