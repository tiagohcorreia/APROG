import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, palindrome, digito;

        num = ler.nextInt();
        int num2 = num;
        palindrome = 0;

        while (num > 0) {

            digito = num % 10;
            palindrome = palindrome * 10 + digito;
            num = num / 10;
        }

        if (palindrome == num2) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
