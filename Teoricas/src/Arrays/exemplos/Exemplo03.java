package Arrays.exemplos;

public class Exemplo03 {

    public static void main(String[] args) {

        // criar um array 2D
        int[][] arr = new int[2][3];

        // declarar e inicializar array 2D
        int[][] arr2 = {{2, 7, 9}, {3, 6, 1}};

        // imprimir array 2D
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 3; coluna++)
                System.out.print(arr[linha][coluna] + " ");
            System.out.println();
        }
    }
}
