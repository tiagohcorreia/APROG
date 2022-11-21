package FecheirosDeTexto.Problemas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Problema1: Ler e visualizar a informação de todos os items comprados.

public class Problema01 {

    public static void lerLinhasInteirasDoFicheiro() throws FileNotFoundException {
        Scanner in = new Scanner( new File("data.txt") );

        String linha = in.nextLine(); //linha do cabecalho
        while (in.hasNextLine()) {
            linha = in.nextLine();
            System.out.println(linha);
        }
        in.close();
    }

}
