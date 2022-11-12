import java.util.Scanner;

public class ExerC {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        double a = 0, b = 0, c = 0;

        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0) {

            System.out.printf("a=" + "%.2f\n", a);
            System.out.printf("b=" + "%.2f\n", b);
            System.out.printf("c=" + "%.2f\n", c);
            System.out.printf("ang(a,b)=" + "%.2f\n", calcularAngulo(a, b, c));
            System.out.printf("ang(a,c)=" + "%.2f\n", calcularAngulo(a, c, b));
            System.out.printf("ang(b,c)=" + "%.2f\n", calcularAngulo(b, c, a));

        } else {

            System.out.println("impossible");
        }
    }

    public static double calcularAngulo(double a, double b, double c){

        double angulo;

        angulo = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        angulo = Math.toDegrees(Math.acos(angulo));

        return angulo;
    }



}
