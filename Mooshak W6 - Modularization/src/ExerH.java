import java.util.Scanner;

public class ExerH {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int tentativas = 1;
        final int MAX_TENTATIVAS = 5;

        int numero = ler.nextInt();
        boolean flag = calcPalindromo(numero);

        while (!flag && (tentativas < MAX_TENTATIVAS)) {

            tentativas = tentativas + 1;
            numero = ler.nextInt();
            flag = calcPalindromo(numero);

        }

        if (tentativas < MAX_TENTATIVAS) {

            System.out.println("palindrome");

        } else {

            System.out.println("attempts exceeded");
        }
    }

    public static boolean calcPalindromo(int numInicial) {

        boolean palindromo;
        int num, num1 = 0, dig;

        num = numInicial;

        while (num != 0) {

            dig = num % 10;
            num1 = num1 * 10 + dig;
            num = num / 10;
        }
        if (num1 == numInicial) {

            palindromo = true;

        } else {

            palindromo = false;

        }

        return palindromo;
    }
}
