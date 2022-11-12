import java.util.Scanner;

public class ExX {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;
        String marca;

        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                marca = "Tag Heuer";
                break;
            case 2:
                marca = "Rolex";
                break;
            case 3:
                marca =  "Omega";
                break;
            case 4:
                marca = "Cartier";
                break;
            case 5:
                marca = "Bvlgari";
                break;
            case 6:
                marca = "Raymond Weil";
                break;
            default:
                marca = "Invalid brand";
        }
        System.out.println(marca);
    }
}
