import java.util.Scanner;

public class ExerG {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int n, numero;

        n = ler.nextInt();

        for (numero = 0; numero <= n; numero++) {

            if (armstrong(numero) == true) {

                System.out.println(numero);
            }
        }
    }

    public static boolean armstrong(int num) {

        boolean nArmstrong;
        int dig, nDig = 0, ogNum;
        double soma = 0;
        ogNum = num;

        while (num > 0) {

            num = num / 10;
            nDig++;
        }
        num = ogNum;

        while (num > 0) {

            dig = num % 10;
            num = num / 10;
            soma = soma + Math.pow(dig, nDig);
        }

        if (soma == ogNum) {

            nArmstrong = true;
        } else {

            nArmstrong = false;
        }

        return nArmstrong;
    }


}




