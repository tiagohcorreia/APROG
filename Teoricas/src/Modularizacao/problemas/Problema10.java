package Modularizacao.problemas;

import java.util.Scanner;

//: Ler o nome de uma disciplina, a quantidade de positivas e negativas e mostrar no seguinte formato (exemplo: “Algorimia” 4 2):

public class Problema10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String disciplina = sc.next();
        int positivas = sc.nextInt();
        int negativas = sc.nextInt();

        tratarDisciplina(disciplina, positivas, negativas);
    }

    public static void tratarDisciplina(String disciplina, int positivas, int negativas) {

        System.out.println("Disciplina : " + disciplina);
        verInfoDaDisciplina("Positivas : ", positivas);  //Reutilização
        verInfoDaDisciplina("Negativas : ", negativas);
    }

    public static void verInfoDaDisciplina(String mensagem, int valor) {   //Abstração //Independência

        System.out.print(mensagem);

        for (int i = 0; i < valor; i++) {

            System.out.print("*");
        }
        System.out.println();
    }


}
