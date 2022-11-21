package Arrays.problemas;

import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nomes[] = new String[20];

        for(int indice = 0; indice <= 19;) {

            System.out.println("Insert a name: ");
            nomes[indice] = ler.next();
            System.out.println("Hello" + nomes[indice] + " nice to meet you");

        }
    }
}
