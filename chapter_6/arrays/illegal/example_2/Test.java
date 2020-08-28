/*
Compilar dentro do diretorio example_2: javac Test.java
*/

package example_2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        char[][] myCharArray = new char[][4]; // nao compila, precisa definir o tamanho no primerio conjunto[2] ou nos dois[2][4]

        /*
            Anonymous Array: não pode tem parametro de quantidade de elementos entre []
        */
        Object[] objectArrays = new Object[3] {null, new Object(), new Object()}; // não compila

    }
}