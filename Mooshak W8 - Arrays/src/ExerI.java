import java.util.Scanner;

public class ExerI {
    static Scanner ler = new Scanner(System.in);
    static final int PISOS = 3;
    static final int ENTRADAS = 4;

    public static void main(String[] args) {

        String[][] proprietarios = new String[PISOS][ENTRADAS];

        lerProprietarios(proprietarios);

        encontrarProprietario(proprietarios);

    }
    public static void lerProprietarios(String[][] proprietarios) {

        for (int pisos = 0; pisos < PISOS; pisos++) {

            for (int entradas = 0; entradas < ENTRADAS; entradas++) {

                proprietarios[pisos][entradas] = ler.nextLine();
            }
        }

    }
    public static void encontrarProprietario(String[][] proprietarios) {

        String procurado = ler.nextLine();

        int cont = 0;

        for (int pisos = 0; pisos < PISOS; pisos++) {

            for (int entradas = 0; entradas < ENTRADAS; entradas++) {

                if (procurado.equals(String.valueOf(proprietarios[pisos][entradas]))) {

                    System.out.println("name=" + procurado);
                    System.out.println("entrance=" + pisos);
                    System.out.println("floor=" + entradas);

                    cont++;
                }

            }
        }
        if (cont == 0) {

            System.out.println("Do not live in the building");
        }

    }
}


