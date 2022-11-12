import java.util.Scanner;

public class ExerF {
    static Scanner ler = new Scanner(System.in);

    static double sphereVolume(double raio) {

        double volume;

        volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;

        return volume;
    }

    static double cylinderVolume(double raio, double altura) {

        double volume;

        volume = Math.PI * Math.pow(raio, 2) * altura;

        return volume;
    }

    static double coneVolume(double raio, double altura) {

        double volume;

        volume = (1 * Math.PI * Math.pow(raio, 2) * altura) / 3;

        return volume;
    }

    public static void main(String[] args) {

        double raio, altura;
        String solido;

        solido = ler.next();

        while (!solido.equals("end")) {

            raio = ler.nextDouble();

            switch (solido) {
                case "cone":

                    altura = ler.nextDouble();
                    System.out.printf("%.2f%n", coneVolume(raio, altura));
                    break;

                case "sphere":

                    System.out.printf("%.2f%n", sphereVolume(raio));
                    break;

                case "cylinder":
                    altura = ler.nextDouble();
                    System.out.printf("%.2f%n", cylinderVolume(raio, altura));
                    break;

            }
            solido = ler.next();

        }

    }
}
