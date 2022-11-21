package FecheirosDeTexto.Problemas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problema05 {

    //Pretende-se ler dum ficheiro de texto (notasAlunos.csv) as notas de vários
    //alunos a 5 disciplinas e visualizar as suas médias ordenadas de forma decrescente. O
    //ficheiro contém em cada linha a seguinte informação:
    //Aluno,nota1,nota2,nota3,nota4,nota5.

    static final int MAX_ALUNOS = 20;   //Não se conhece a dimensão! Assume-se valores máximos
    static final int DISCIPLINAS = 5;

    static final String FILE_IN = "notasAlunos.csv";

    public static void main(String[] args) throws FileNotFoundException {

        String[] arrNomes = new String[MAX_ALUNOS]; //Podia definir-se a dimensão mais tarde, após conhecer a quantidade efetiva de alunos

        int[][] arrNotas = new int[MAX_ALUNOS][DISCIPLINAS];
        double[] arrMedias = new double[MAX_ALUNOS];

    }

    public static int lerDadosDoFicheiro(String[] arrNomes, int[][] arrNotas, String nomeFicheiro) throws FileNotFoundException {

        Scanner in = new Scanner(new File(nomeFicheiro));    //Abrir ficheiro
        int qtdAlunos = 0;

        while (in.hasNextLine()) {//Verificar se existe linha no ficheiro

            String line = in.nextLine();              //Extrair linha do ficheiro
            String[] itens = line.split(",");  //Cortar pelas virgulas
            arrNomes[qtdAlunos] = itens[0];         //Guardar nome

            for (int disciplina = 0, item = 1; item < itens.length; disciplina++, item++) {  //Guardar notas

                arrNotas[qtdAlunos][disciplina] = Integer.parseInt(itens[item]);
            }
            qtdAlunos++;
        }
        in.close();                   //Fechar ficheiro
        return qtdAlunos;
    }

    public static double[] calcularMedias(int[][] arrNotas, int totalAlunos) {

        //- Método cria, preenche e retorna o array das médias

        double[] arrMedias = new double[totalAlunos];

        for (int aluno = 0; aluno < totalAlunos; aluno++) {

            int soma = 0;

            for (int disciplina = 0; disciplina < DISCIPLINAS; disciplina++) {

                soma += arrNotas[aluno][disciplina];
            }
            arrMedias[aluno] = (double) soma / DISCIPLINAS;
        }
        return arrMedias;
    }

    public static void ordenarInformacao(String[] arrNomes, int[][] arrNotas, double[] arrMedias, int totalAlunos) {

        for (int idx1 = 0; idx1 < totalAlunos - 1; idx1++) {
            for (int idx2 = idx1 + 1; idx2 < totalAlunos; idx2++) {
                if (arrMedias[idx2] > arrMedias[idx1]) {

//.....[troca media]
                    double auxMedia = arrMedias[idx1];
                    arrMedias[idx1] = arrMedias[idx2];
                    arrMedias[idx2] = auxMedia;
//.....[troca nome]
                    String auxNome = arrNomes[idx1];
                    arrNomes[idx1] = arrNomes[idx2];
                    arrNomes[idx2] = auxNome;
//.....[troca notas]
                    for (int disciplina = 0; disciplina < DISCIPLINAS; disciplina++) {   //troca linha inteira

                        int[] auxNotas = arrNotas[idx1];
                        arrNotas[idx1] = arrNotas[idx2];
                        arrNotas[idx2] = auxNotas;
                    }
                }
            }
        }
    }

    public static void visualizarMedias(String[] arrNomes, double[] arrMedias, int totalAlunos) {

        for (int aluno = 0; aluno < totalAlunos; aluno++) {

            System.out.printf("%-10s : %5.2f %n", arrNomes[aluno], arrMedias[aluno]);
        }
    }



}

