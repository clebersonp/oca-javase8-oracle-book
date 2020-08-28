/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

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
        */

        int[] testScores; // declarar
        testScores = new int[4]; // criar o objeto na memoria heap e inicializados os elementos com valor defaul 0 (ZERO) para int

        System.out.println(String.format("Inicializacao default: %s", Arrays.toString(testScores)));

        for(int x = 0; x < testScores.length; x++) {
            testScores[x] = x * 2; // inicializando os elementos do array
        }

        System.out.println(String.format("Array inicializado: %s", Arrays.toString(testScores)));



        /* 
            Declarar e construir um objeto de array em uma unica instrucao
            Neste momento é criado apenas um objeto na memória heap, o objeto array que é
            referenciado pela variavel testThreads;
        */
        Thread testThreads[] = new Thread[4];
        System.out.println(String.format("Inicializacao default array threads: %s", Arrays.toString(testThreads)));

        /*
            Adicionando o conjunto de [] após o nome do identificador.
        */
        boolean testBool[] = new boolean[2];
        System.out.println(String.format("Inicializacao default array bool: %s", Arrays.toString(testBool)));
    }
}