/*
Compilar dentro do diretorio example_6: javac Test.java
Executar dentro do diretorio example_6: java -cp ../ example_6.Test
*/

package example_6;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
            Array eh um objeto em java, independente se eh array de tipos primitivos ou não.
            A referencia do array aponta para um objeto na memória.

            Arrays são objetos que armazena variaveis do mesmo tipo;

            3 Passos para criar arrays:
            1 - Declarar;
            2 - Construir um objeto array
            3 - Inicializar os elementos do array

            Todo array criado tem seus elementos inicializados com valor default
            de primitivos e null para referencia de objetos

            Um array de int pode conter qualquer tipo numerico que caiba em um int 32-bit, ou seja, que pode ser promovido a um int;
        */

        int[] weightList = new int[5];
        byte b = 4;
        char c = 'c';
        short s = 7;
        weightList[0] = b; // OK, byte cabe em um int
        weightList[1] = c; // OK, char cabe em um int
        weightList[2] = s; // OK, short cabe em um int

        System.out.println(Arrays.toString(weightList));
    }
}