import java.util.Scanner;

public class ExerC {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[];
        arr = lerVetor();

        if(verificar(arr)) {

            System.out.println("always ascending = true" );

        } else {

            System.out.println("always ascending = false");
        }
    }

    public static int[] lerVetor() {

        int n = ler.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = ler.nextInt();

        }
        return arr;
    }

    public static boolean verificar(int[] arr) {

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] <= arr[i - 1]) {
                return false;
            }

        }
        return true;

    }

}
