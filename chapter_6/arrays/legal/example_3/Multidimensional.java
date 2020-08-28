/*
Compilar dentro do diretorio example_3: javac Multidimensional.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Multidimensional
*/

package example_3;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        /*
            Multidimensional arrays: São arrays e seus elementos são outros referencias a outros arrays;
        */

        // Declara e cria um array (scores) que pode suportar 3 referenças para arrays de int
        int[][] scores = new int[3][];

        /*
            Primeiro elemento do array scores eh um array de int de 4 elementos inteiros
        */
        scores[0] = new int[4];

        /*
            Segundo elemento do array scores eh um array de int de 6 elementos inteiros
        */
        scores[1] = new int[6];

        /*
            Terceiro elemento do array scores eh um array de int de 1 elemento inteiros
        */
        scores[2] = new int[1];

        System.out.println(Arrays.deepToString(scores));
    }
}