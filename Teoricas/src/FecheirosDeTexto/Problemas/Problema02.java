package FecheirosDeTexto.Problemas;



//Problema2: visualizar o valor total gasto nas compras.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problema02 {

    public static void calcularTotalDasCompras() throws FileNotFoundException {

        Scanner in = new Scanner(new File("data.txt"));

        String linha = in.nextLine(); //linha do cabecalho

        int item;
        String seccao, produto;
        double quantidade, valor, total = 0;

        while (in.hasNext()) {
            item = in.nextInt();
            seccao = in.next();
            produto = in.next();
            quantidade = in.nextDouble();
            valor = in.nextDouble();
            total += valor;
        }
        in.close();
        System.out.println("total=" + total);
    }



}
