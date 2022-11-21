package Modularizacao.problemas;

public class Problema07 {

    //Ler uma string e verificar se é elegível para password. Uma password tem de conter no mínimo 12 símbolos e pelo
    // menos dois elementos de cada um dos seguintes conjuntos: letras maiúsculas, minúsculas e algarismos.

    public static boolean ePasswordValida(String pwd){

        final int MIN_TAMANHO = 12;
        final int MIN_SIMBOLOS = 2;

        int maiusculas, minusculas, numeros;
        char simbolo;

        if(pwd.length() < MIN_TAMANHO) {

            return false;
        }

        maiusculas = minusculas = numeros = 0;

        for(int i=0; i < pwd.length(); i++) {

            simbolo = pwd.charAt(i);

            if( Character.isDigit(simbolo)) {

                numeros++;

            } else if (Character.isUpperCase(simbolo)) {

                maiusculas++;

            } else if (Character.isLowerCase(simbolo)) {

                minusculas++;
            }
        }
        if(numeros < MIN_SIMBOLOS || maiusculas < MIN_SIMBOLOS || minusculas < MIN_SIMBOLOS)
            return false;
        else
            return true;
    }
}
