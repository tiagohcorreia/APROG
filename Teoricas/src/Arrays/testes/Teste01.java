package Arrays.testes;

public class Teste01 {

    public static void main(String[] args) {

        int[] meuArray = {3, 1, 2, 5, 4};

        somarArray( meuArray ); // passar array para o método somarArray()
    }
    public static void somarArray( int[] arr ) { // somar os elementos do array

        int soma = 0;

        for (int i = 0; i < arr.length; i++) {

            soma += arr[i];

        }
        System.out.println("soma dos elementos do array : " + soma);
    }

}
