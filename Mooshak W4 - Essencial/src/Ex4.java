import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int digImpar;
        int produto = 1;
        int cont = 0;

        numero = ler.nextInt();

        while (numero >= 0) {

            while (numero != 0) {

                digImpar = numero % 10;

                if (digImpar % 2 != 0) {

                    produto = produto * digImpar;
                    cont = cont + 1;
                }
                numero = numero / 10;
            }
            if (cont == 0) {

                System.out.println("no odd digits");
            } else {
                System.out.println(produto);
            }
            produto = 1;
            cont = 0;
            numero = ler.nextInt();
            
        }

    }
}

