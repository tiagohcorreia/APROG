import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2;
        int contador = 2;
        int mmc = 1;

        num1 = ler.nextInt();
        num2 = ler.nextInt();

        if (num1 >= 0 && num2 >= 0) {

            while (num1 + num2 != 2) {

                if (num1 % contador == 0 || num2 % contador == 0) {

                    mmc *= contador;

                    if (num1 % contador == 0) {
                        num1 /= contador;
                    }
                    if (num2 % contador == 0) {
                        num2 /= contador;
                    }
                } else {
                    contador++;
                }


            }
            System.out.println(mmc);
        }
    }
}
