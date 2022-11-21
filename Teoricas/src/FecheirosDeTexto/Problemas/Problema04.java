package FecheirosDeTexto.Problemas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Problema04 {

    // gravar no ficheiro “data2.txt” alguns items de compras

    public static void escreverParaFicheiro() throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("data2.txt"));
        String[] arr1 = {"frutas", "bebidas", "bebidas", "talho"};
        String[] arr2 = {"banana", "sumol", "fanta", "costeleta"};
        double[] arr3 = {1.2, 2, 6, 0.75};
        double[] arr4 = {3.1, 1.45, 3.99, 5.99};
        for (int item = 0; item < 4; item++) {
            out.printf("%d %s %s %f %.2f\n", (item + 1), arr1[item], arr2[item], arr3[item], arr4[item]);
        }
        out.close();
    }
}
