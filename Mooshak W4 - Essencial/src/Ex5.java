import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {                   //Octal para Decimal
        Scanner ler = new Scanner(System.in);

        int numOctal;
        int numDecimal;
        int digito;
        int expoente = 0;
        numDecimal = 0;

        numOctal = ler.nextInt();

        while (numOctal >= 0) {

            while (numOctal != 0) {

                numDecimal += (numOctal % 10) * (int) Math.pow(8, expoente);

                expoente++;

                numOctal /= 10;

            }
            System.out.println(numDecimal);

            numOctal = ler.nextInt();
            numDecimal = 0;
            expoente = 0;
        }


    }


}

