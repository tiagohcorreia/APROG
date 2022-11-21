package FecheirosDeTexto.Exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exemplo03 {

    public static void usingScanner() throws FileNotFoundException {
        File file = new File("samplefile3.txt");
        Scanner sc = new Scanner(file);
        System.out.println( sc.nextLine() );
        System.out.println( sc.nextInt() );
        System.out.println( sc.next() );
        System.out.println( sc.nextLine() );
        //scanner.close();



        //Verificar se existe informação na entrada de dados

        //hasNext()
        //hasNextInt()
        //hasNextDouble()
        //hasNextFloat()
        //hasNextLine()
    }
}
