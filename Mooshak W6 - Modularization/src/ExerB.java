import java.util.Scanner;

public class ExerB {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int numAlunos, numDisciplinas, numPositivas;
        String disciplina;

        do {
            numAlunos = ler.nextInt();

        } while (numAlunos < 0);

        do {
            numDisciplinas = ler.nextInt();

        } while (numDisciplinas < 0);

        for (int i = 1; i <= numDisciplinas; i++) {

            disciplina = ler.next();

            do {
                numPositivas = ler.nextInt();

            } while (numPositivas < 0);

            info(disciplina, numPositivas, numAlunos);

        }

    }

    public static void info(String disciplina, int positivas, int nAlunos) {

        int negativas = nAlunos - positivas;

        String astPositivo = "";
        String astNegativo = "";

        System.out.println("Disciplina: " + disciplina);

        for (int i = 1; i <= positivas; i++) {

            astPositivo = astPositivo + "*";
        }
        for (int i = 1; i <= negativas; i++) {

            astNegativo = astNegativo + "*";
        }

        System.out.println("- Positivas: " + astPositivo);
        System.out.println("- Negativas: " + astNegativo);

    }


}
