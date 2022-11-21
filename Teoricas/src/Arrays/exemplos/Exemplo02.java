package Arrays.exemplos;

public class Exemplo02 {

    //Aceder a um array
    //▪ O índice usado tem de estar dentro dos limites, [0 … tamanho-1]
    //▪ O tamanho de um array é conhecido através do seu atributo length
    //▪ A tentativa de acesso fora dos limites gera o erro ArrayIndexOutOfBoundException

    public static void main(String[] args) {

        double[] notas = new double[15];

        notas[-1] = 19;    // ERRO (ArrayIndexOutOfBoundException)
        notas[15] = 19;    // ERRO (ArrayIndexOutOfBoundException)
        notas[0] = 19;     // OK – guarda o número 19 na posição 0)
        notas[1] = 20.5;   // OK – guarda o número 20,5 na posição 1)
        notas[14] = 99;    // OK - guarda o número 99 na posição 14)


    }
}
