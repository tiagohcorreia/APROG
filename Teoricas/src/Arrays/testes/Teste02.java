package Arrays.testes;

public class Teste02 {

    public static void main(String[] args) {

        String[] arr; // declarar array

        arr = diasDaSemana(); // receber array retornado pelo método diasDaSemana()
    }

    public static String[] diasDaSemana() {   //Cria e retorna array com os nomes dos dias da semana

        String[] result = new String[7];

        result[0] = "Domingo";
        result[1] = "Segunda";
        result[2] = "Terça";
        result[3] = "Quarta";
        result[4] = "Quinta";
        result[5] = "Sexta";
        result[6] = "Sábado";

        return result;
    }
}
