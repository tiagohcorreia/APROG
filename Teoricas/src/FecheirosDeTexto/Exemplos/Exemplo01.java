package FecheirosDeTexto.Exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exemplo01 {

    public static void usingPrintWriter() throws FileNotFoundException { //Exceção verificável

        String fileContent = "Hello. Welcome to APROG.";

        File file = new File("c:/temp/samplefile3.txt");

        PrintWriter printWriter = new PrintWriter(file);  //Criar ficheiro

        printWriter.print(fileContent);
        printWriter.println();
        printWriter.printf("%d in a %s", 24, "row");
        printWriter.close();     //Fechar ficheiro
    }
}

