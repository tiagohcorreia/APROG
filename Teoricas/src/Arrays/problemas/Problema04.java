package Arrays.problemas;

public class Problema04 {

    //Implemente um método que calcule o somatório dos elementos (números
    //inteiros) de uma linha de uma matriz. O método recebe, por parâmetro, a matriz
    //e o número da linha a somar e retorna o valor do somatório calculado.

    public static void main(String args[]) {

        int [][] matriz = { {2,7,9,1,3}, {3,6,1,2,2}, {2,3,4,5,6} };

        System.out.println("soma = " + somarLinha(matriz, 2));
    }
    public static int somarLinha(int[][] arr, int linha) {

        int soma = 0;

        for (int coluna=0; coluna < 5 ; coluna++) {    // coluna < 5  coluna < arr[linha].length

            soma += arr[linha][coluna];
        }

        return soma;
    }
}
