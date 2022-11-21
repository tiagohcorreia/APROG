package FecheirosDeTexto.Exemplos;

import java.io.File;
import java.io.FileNotFoundException;

public class Exemplo02 {

    //Formatter (java.util.Formatter)
    //• Permite escrever texto formatado num ficheiro de texto.
    //• Permite usar o método de formatação format()

    public static void usingFormatter() throws FileNotFoundException {

        String fileContent = "Hello. Welcome to APROG.";

        File file = new File("c:/temp/samplefile3.txt");

       // Formatter formatter = new Formatter(file);
       // formatter.format(fileContent + "\n”);
       // formatter.format("%d in a %s", 24, "row");
        // formatter.close();
    }
}
