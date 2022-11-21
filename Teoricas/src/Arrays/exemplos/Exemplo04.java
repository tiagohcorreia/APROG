package Arrays.exemplos;

public class Exemplo04 {

    public static void main(String[] args) {

        // criar um array 3D
        int[][][] arr = new int[2][3][4];

        // declarar e inicializar array 3D
        int[][][]arr1 = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        // imprimir array 3D
        for (int camada = 0; camada < 2; camada++) {

            for (int linha = 0; linha < 2; linha++) {

                for (int coluna = 0; coluna < 3; coluna++) {

                    System.out.print(arr[linha][coluna][camada] + " ");
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
