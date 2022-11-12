import java.util.Scanner;

public class ExerI {
    public static void main(String[] args) {

        int num;

        Scanner ler = new Scanner(System.in);

        num = ler.nextInt();

        if (fibonacci(num) == true) {

            System.out.println("is a Fibonacci number");

        } else {

            System.out.println("is not a Fibonacci number");
        }
    }
    public static boolean fibonacci(int num) {

        int num1 = 1, num2 = 0, num3;

        while (num1 <= num) {

            num3 = num1 + num2;
            num2 = num1;
            num1 = num3;

            if (num == 0 || num == num3 || num == num2 || num == num1) {

                return true;
            }
        }
        return false;
    }


}
