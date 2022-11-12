import java.util.Scanner;

public class ExerD {

    public static void main(String[] args) {

        int num1, num2;

        Scanner ler = new Scanner(System.in);

        num1 = ler.nextInt();
        num2 = ler.nextInt();

        if (num1 >= num2){

            System.out.println("C(" + num1 + "," + num2 + ")=" + combinations(num1,num2));
            System.out.println("P(" + num1 + "," + num2 + ")=" + permutations(num1,num2));
        }

    }

    static int fatorial(int num) {

        int valor = 1;

        while (num > 1){

            valor = valor * num;
            num--;

        }
        return valor;

    }

    public static int combinations(int m, int n) {

        int combinacao;

        combinacao = (fatorial(m) / (fatorial(n) * (fatorial(m - n))));

        return combinacao;

    }

    public static int permutations(int num1, int num2) {

        int permutacao;

        permutacao = (fatorial(num1) / (fatorial(num1 - num2)));

        return permutacao;

    }


}
