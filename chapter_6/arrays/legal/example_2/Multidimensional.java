/*
Compilar dentro do diretorio example_2: javac Multidimensional.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Multidimensional
*/

package example_2;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        /*
            Multidimensional arrays: São arrays e seus elementos são outros referencias a outros arrays;
        */

        int[][] myIntArray = new int[3][];

        myIntArray[0] = new int[2];
        myIntArray[0][0] = 6;
        myIntArray[0][1] = 7;
        myIntArray[1] = new int[3];
        myIntArray[1][0] = 9;
        myIntArray[1][1] = 8;
        myIntArray[1][2] = 5;

        System.out.println(Arrays.deepToString(myIntArray));

        // o primeiro parametro 2 eh para definir a quantidade elementos de array de boolean(boolean[] array)
        // o segundo parametro 4 eh para definir a quantidade de elementos do tipo boolean(boolean element) para cada array
        boolean[][] myBooleanArray = new boolean[2][4];
        System.out.println(Arrays.deepToString(myBooleanArray));
       
    }
}