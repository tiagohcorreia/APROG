package FecheirosDeTexto.Problemas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problema03 {

    //visualizar o valor total gasto numa secção específica.

    public static void totalGastoNaSeccao(String seccao) throws FileNotFoundException {

        Scanner in = new Scanner(new File("data.txt"));

        String linha;
        double total = 0;

        while (in.hasNextLine()) {

            linha = in.nextLine();
            String[] itensDaLinha = linha.split(" ");
            if (seccao.equals(itensDaLinha[1])) {
                total += Double.parseDouble(itensDaLinha[4]);
            }
        }
        in.close();
        System.out.println("seccao [" + seccao + "] total=" + total);
    }

}
