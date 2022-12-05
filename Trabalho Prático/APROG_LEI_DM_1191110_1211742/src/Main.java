import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("testetexto4.txt");
        int difTemp1 = -10;// mudar consoante o mapa;
        int difTemp2 = 10;

        /*a)*/
        int[][] MT = readFile(file);

        /*b)*/
        System.out.println("b)");
        writeMT(MT);

        /*c)*/
        System.out.println("c)");
        String[][] MA = MA(MT);
        writeMA(MA);

        /*d)*/
        System.out.println("d)");
        MTwithDifference(MT, difTemp1);
        writeMT(MT);
        MA = MA(MT);
        writeMA(MA);

        /*e)*/
        double[] quantAlertStates = countAlertStates(MA);
        double[] percentagem = calcPercAlertStates(quantAlertStates, MT);
        viewPercAlertStates(percentagem);//mostrarPercentagemDeEstadosDeAlerta(percentagem, MA, L, C);

        /*f)*/
        allCatastrophic(MT);// escrever quantos graus a temperatura tem que aumentar para todos os alertas serem CATASTROPHIC

        /*g)*/
        System.out.println("g)");
        String[][] MAAux = setMAAux(MA);
        MTwithDifference(MT, difTemp2);
        MA = MA(MT);
        writeMA(MA);
        double percentgemAlt = calcPercChangedElements(MA, MAAux);
        writePercentageOfChanges(percentgemAlt, difTemp2);

        /*h)*/
        System.out.println("h)");
        MAWithWind(MA);//usar o MA produzido no g)
        writeMA(MA);


        /*i)*/
        System.out.println("i)");
        //int[] coordinates = fireFighting(MT);
        writeMT(MT);
        int[] coordinates = fireFighting2(MT);
        writeCoordinates(coordinates);

        /*j)*/
        checksafeColumn(MA);


    }
    //================================================================================================================

    //a)
    public static int[][] readFile(File file) throws FileNotFoundException {

        Scanner scan = new Scanner(file);

        scan.nextLine();
        int L = scan.nextInt();
        int C = scan.nextInt();
        int[][] MT = new int[L][C];

        for (int i = 0; i <= L - 1; i++) {

            for (int u = 0; u <= C - 1; u++) {

                MT[i][u] = scan.nextInt();
            }
        }
        scan.close();
        return MT;
    }

    //=================================================================================================================

    //b)
    public static void writeMT(int[][] MT) {


        for (int L = 0; L <= MT.length - 1; L++) {

            for (int C = 0; C <= MT[0].length - 1; C++) {

                System.out.printf("%3s ", MT[L][C]);// visualizar as temperaturas do mapa linha a linha
            }
            System.out.println();
        }
        System.out.println();
    }

    //=================================================================================================================

    //c)
    public static String[][] MA(int[][] MT) { //visualizar o nivel de alerta do MA com a diferença de temperatura

        String[][] str = new String[MT.length][MT[0].length];

        for (int L = 0; L <= MT.length - 1; L++) {

            for (int C = 0; C <= MT[0].length - 1; C++) {

                if (MT[L][C] < 20) {

                    str[L][C] = "M";

                } else if (MT[L][C] < 30 && MT[L][C] >= 20) {

                    str[L][C] = "H";

                } else if (MT[L][C] < 40 && MT[L][C] >= 30) {

                    str[L][C] = "E";

                } else if (MT[L][C] >= 40) {

                    str[L][C] = "C";
                }
            }
        }
        return str;
    }

    public static void writeMA(String[][] MA) {

        for (int L = 0; L <= MA.length - 1; L++) {

            for (int C = 0; C <= MA[0].length - 1; C++) {

                System.out.print(MA[L][C]);// visualizar as condiçoes de alerta do mapa linha a linha
            }
            System.out.println();
        }
        System.out.println();
    }

    //=================================================================================================================

    //d)
    public static void MTwithDifference(int[][] MT, int difTemp) {


        for (int L = 0; L <= MT.length - 1; L++) {

            for (int C = 0; C <= MT[0].length - 1; C++) {

                MT[L][C] = MT[L][C] + difTemp;
            }
        }
    }
    //=================================================================================================================

    //e)
    public static double[] countAlertStates(String[][] MA) {

        double[] quantidadeDeCadaEstado = new double[4];

        for (int i = 0; i <= MA.length - 1; i++) {

            for (int j = 0; j <= MA[0].length - 1; j++) {

                if (MA[i][j].equals("M") ) {

                    quantidadeDeCadaEstado[0]++;

                } else if (MA[i][j].equals("H")) {

                    quantidadeDeCadaEstado[1]++;

                } else if (MA[i][j].equals("E")) {

                    quantidadeDeCadaEstado[2]++;

                } else if (MA[i][j].equals("C")) {

                    quantidadeDeCadaEstado[3]++;

                }
            }
        }
        return quantidadeDeCadaEstado;
    }

    public static double[] calcPercAlertStates(double[] quantidadeDeCadaEstado, int[][] MT) {

        double[] percentagem = new double[4];

        for (int i = 0; i <= quantidadeDeCadaEstado.length - 1; i++) {

            percentagem[i] = ((quantidadeDeCadaEstado[i] / (MT[0].length * MT.length)) * 100);

        }
        return percentagem;
    }

    public static void viewPercAlertStates(double[] percentagem) {

        System.out.println("e)");
        System.out.printf("MODERATE    : %5.2f%%%n", percentagem[0]);
        System.out.printf("HIGH        : %5.2f%%%n", percentagem[1]);
        System.out.printf("EXTREME     : %5.2f%%%n", percentagem[2]);
        System.out.printf("CATASTROPHIC: %5.2f%%%n", percentagem[3]);
        System.out.println();
    }

    //=================================================================================================================

    //f)
    public static void allCatastrophic(int[][] MT) { //(QUAL TEMPERATURA USAR??)determinar minimo para saber a diferença necessaria para ficar catastrofico geral

        int min = MT[0][0];
        System.out.println("f)");

        for (int L = 0; L <= MT.length - 1; L++) {

            for (int C = 0; C <= MT[0].length - 1; C++) {

                if (MT[L][C] < min) {
                    min = MT[L][C];
                }
            }
        }
        if (min >= 40) {

            System.out.println("All terrain is on CATASTROPHIC alert!");

        } else {

            System.out.println("To get all terrain on CATASTROPHIC alert, the temperature has to rise : " + (40 - min) + " ºC");

        }
        System.out.println();
    }

    //==================================================================================================================

    //g)
    public static String[][] setMAAux(String[][] MA) {

        String[][] MA2 = new String[MA.length][MA[0].length];

        for (int i = 0; i < MA.length; i++) {

            for (int j = 0; j < MA[0].length; j++) {

                MA2[i][j] = MA[i][j];

            }

        }
        return MA2;
    }

    public static double calcPercChangedElements(String[][] MA, String[][] MAAux) {

        int contador = 0;

        for (int i = 0; i <= MA.length - 1; i++) {

            for (int j = 0; j < MA[0].length; j++) {

                if (!MA[i][j].equals(MAAux[i][j])) {

                    contador++;
                }

            }

        }
        double percentagem = (double) contador / (MA[0].length * MA.length) * 100;
        return percentagem;
    }

    public static void writePercentageOfChanges(double percentagem, double diftemp) {

        System.out.printf("Alert Levels changes due to temperature variations by %sºC : %.2f%%%n", diftemp, percentagem); // a diferença de temp está como string!! É preciso mudar?
        System.out.println();
    }

    //=================================================================================================================

    //h)
    public static void MAWithWind(String[][] MA) {

        for (int L = MA.length - 1; L >= 1; L--) {

            for (int C = 0; C <= MA[0].length - 1; C++) {

                if (MA[L - 1][C].equals("C")) {
                    MA[L][C] = "C";

                } else {
                    MA[L][C] = MA[L][C];
                }
            }
        }
    }



    //=================================================================================================================

    //i)
    /*public static int[] fireFighting(int[][] MT) {

        int[] coord = new int[2];
        coord[0] = -1;
        coord[1] = -1;

        for (int i = MT.length - 1; i >= 0; i--) {

            for (int j = MT[0].length - 1; j >= 0; j--) {

                if (MT[i][j] > 50) {

                    if ((j>0 && j< MT[0].length) && (i>0 && i< MT.length)){
                        coord[0]=i;
                        coord[1]=j;
                    }
                    if (j==0){
                        coord[1]=j+1;
                    }
                    if ((j==MT[0].length)){
                        coord[1]=j-1;
                    }
                    if (i==0){
                        coord[0]=i+1;
                    }
                    if (i== MT.length){
                        coord[0]=i-1;
                    }
                }
            }
        }

        return coord;
    }*/

    public static int[] fireFighting2(int[][] MT) {
        int[] numMax = new int[1];
        int[] coord = new int[2];
        coord[0] = -1;
        coord[1] = -1;

        for (int i = MT.length - 1; i >= 0; i--) {//procura na matriz MT celulas acima de 50

            for (int j = MT[0].length - 1; j >= 0; j--) {

                if (MT[i][j] > 50) {
                    fireFightingM1(MT, i, j, coord,numMax);
                }
            }
        }
        return coord;
    }

    public static void fireFightingM1(int[][] MT, int i, int j, int[] coord, int[]numMax) {


        if (MT.length < 3 || MT[0].length < 3) {

            coord[0] = -2;
            coord[1] = -2;

        }else if (MT.length == 3 && MT[0].length == 3) {

            coord[0] = 1;
            coord[1] = 1;

        } else if (MT.length == 3 && j == 1) {

            for (int l = 2; l >= 1; l--) {

                fireFightingM(MT, 1, l, coord, numMax);

            }
        }else if (MT.length == 3 && j == MT[0].length - 2) {

            for (int l = MT[0].length - 2; l >= MT[0].length - 3; l--) {

                fireFightingM(MT, 1, l, coord, numMax);

            }
        } else if (MT[0].length == 3 && i == 1) {

            for (int k = 2; k >= 1; k--) {

                fireFightingM(MT, k, 1, coord, numMax);
            }
        }else if (MT[0].length == 3 && i == MT.length - 2) {

            for (int k = MT[0].length - 2; k >= MT[0].length - 3; k--) {

                fireFightingM(MT, k, 1, coord, numMax);

            }
        }else if (j == 0 && i == 0) {
            coord[0] = 1;
            coord[1] = 1;

        }else if ((j == 0) && ((i == MT.length - 1))) {
            coord[0] = MT.length - 2;
            coord[1] = 1;

        }else if (j == 0 && (i > 0 && i < MT.length-1)) {

            for (int k = i + 1; k >= i - 1; k--) {//percorre as celulas envolventes

                fireFightingM(MT, k, 1, coord, numMax);

            }
        }else if ((j == MT[0].length - 1) && i == MT.length - 1) {

            coord[0] = MT.length - 2;
            coord[1] = MT[0].length - 2;


        }else if ((j > 0 && j < MT[0].length-1) && i == MT.length - 1) {

            for (int l = j + 1; l >= j - 1; l--) {

                fireFightingM(MT, MT.length - 2, l, coord, numMax);
            }
        }else if (j == MT[0].length - 1 && (i > 0 && i < MT.length - 1)) {

            for (int k = i + 1; k >= i - 1; k--) {//percorre as celulas envolventes
                fireFightingM(MT, k, MT[0].length - 2, coord, numMax);

            }
        }else if ((j > 0 && j < MT[0].length-1) && i == 0) {

            for (int l = j + 1; l >= j - 1; l--) {
                fireFightingM(MT, 1, l, coord, numMax);

            }
        } else if (j == 1 && i == 1) {

            for (int k = i + 1; k >= i; k--) {

                for (int l = 2; l >= 1; l--) {

                    fireFightingM(MT, k, 1, coord, numMax);

                }
            }
        }else if (j == 1 && i == MT.length - 2) {

            for (int k = i; k >= i - 1; k--) {

                for (int l = 2; l >= 1; l--) {

                    fireFightingM(MT, k, 1, coord, numMax);

                }
            }
        }else if (j == 1 && i > 1 && i < MT.length - 2) {

            for (int k = i + 1; k >= i - 1; k--) {

                for (int l = 2; l >= 1; l--) {

                    fireFightingM(MT, k, 1, coord, numMax);
                }
            }
        }else if (j == MT[0].length - 2 && i == MT.length - 2) {

            for (int k = i; k >= i - 1; k--) {

                for (int l = j; l >= j - 1; l--) {

                    fireFightingM(MT, k, l, coord, numMax);
                }
            }
        }else if (j > 1 && j < MT[0].length - 2 && i == MT.length - 2) {

            for (int k = i; k >= i - 1; k--) {

                for (int l = j + 1; l >= j - 1; l--) {

                    fireFightingM(MT, k, l, coord, numMax);
                }
            }
        }else if (j == MT[0].length - 2 && i == 1) {

            for (int k = 2; k >= 1; k--) {

                for (int l = j; l >= j - 1; l--) {

                    fireFightingM(MT, k, l, coord, numMax);
                }
            }
        }else if (j == MT[0].length - 2 && i > 1 && i < MT.length - 2) {

            for (int k = i - 1; k >= i + 1; k--) {

                for (int l = j; l >= j - 1; l--) {

                    fireFightingM(MT, k, l, coord, numMax);

                }
            }
        }else if ((j > 1 && j < MT[0].length - 2) && i == 1) {

            for (int k = 2; k >= 1; k--) {

                for (int l = j + 1; l >= j - 1; l--) {

                    fireFightingM(MT, k, l, coord, numMax);
                }
            }
        }else if ((j > 1 && j < MT[0].length - 2) && (i > 1 && i < MT.length - 2)) {

            for (int k = i + 1; k >= i - 1; k--) {//percorre as celulas envolventes

                for (int l = j + 1; l >= j - 1; l--) {

                    fireFightingM(MT, k, l, coord, numMax);

                }
            }
        }
    }

    public static int[] fireFightingM(int[][] MT, int k, int l, int[] coord, int[] numMax) {
        int cont = 0;
        for (int m = k + 1; m >= k - 1; m--) {// percorre a matriz envolvente

            for (int n = l + 1; n >= l - 1; n--) {


                if (MT[m][n] > 50) {
                    cont++;
                }

            }
        }

        if (cont >= numMax[0]) {

            numMax[0] = cont;
            coord[0] = k;
            coord[1] = l;
        }
        return numMax;
    }

    public static void writeCoordinates(int[] coordinates) { // verificar veracidade das coordenadas no enunciado


        if (coordinates[0] == -2 || coordinates[1] == -2) {

            System.out.println("bucket not fit for dimensions");

        } else if (coordinates[0] == -1 || coordinates[1] == -1) {

            System.out.println("no fire");

        } else {

            System.out.println("drop water at (" + coordinates[0] + "," + coordinates[1] + ")");

        }
        System.out.println();
    }

    //=================================================================================================================

    //j)
    public static void checksafeColumn(String[][] MA) {

        System.out.println("j)");

        int safeColumn=0;
        int cont = 0;

        for (int C = 0; C <= MA[0].length - 1; C++) {

            boolean safe = true;

            for (int L = 0; L <= MA.length - 1; L++) {

                if (MA[L][C].equals("C")) {

                    safe = false;
                }
            }
            if (safe == true) {

                cont++;
                safeColumn = C;
            }
        }
        if (cont != 0) {

            System.out.println("safe column= (" + safeColumn + ")");

        } else {

            System.out.println("safe column = NONE");
        }
    }

    //=================================================================================================================

}
