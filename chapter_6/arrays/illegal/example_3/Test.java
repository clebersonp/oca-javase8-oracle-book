/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        /*
            Indice de arrays começam do 0(ZERO) e a ultima posição do array eh (array.length - 1);
            Arrays não aceitam indices negativos;
        */

        int[] x = new int[5];
        x[4] = 2;
        x[5] = 3; // compila mas da erro de execução: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5

        int z [] = new int[2];
        int y = -3;
        z[y] = 4; // compila mas da erro de execução: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -3

    }
}