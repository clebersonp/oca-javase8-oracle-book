/*
Compilar dentro do diretorio example_5: javac Test.java
Executar dentro do diretorio example_5: java -cp ../ example_5.Test
*/

package example_5;

import java.util.Arrays;

public class Test {

    public void takeArray(final int[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }

    public void takeArrayOfArrays(final int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        /*
            Construir e inicializar Anonymous Array. Nesse tipo de sintaxe não pode usar tamanho
            do array entre [], caso contrário sera erro de compilação
        */

        new Test().takeArray( new int[] {4, 7, 2} );

        new Test().takeArrayOfArrays( new int[][] { {4, 5}, {1, 8, 7}, {0, 6, 3, 2} } );

    }
}