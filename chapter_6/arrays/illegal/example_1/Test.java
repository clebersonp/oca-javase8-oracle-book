/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
            Ao criar um array é necessário informar a quantidade de elementos que o array irá possuir.
            Caso não seja informado, havera erro de compilação;
            A quantidade de elementos do array sempres tem que ser declarada do lado direito, ou seja, lado
            que estiver criando o array com a keyword new;
            Caso a quantidade de elementos esteja do lado da declaração(lado esquerdo), havera erro de compilação;
        */

        int[] testScores = new int[]; // erro de compilacao: Test.java:20: error: array dimension missing
        
        boolean testBool[2] = new boolean[]; // erro de compilacao: Test.java:22: error: illegal start of expression
    }
}