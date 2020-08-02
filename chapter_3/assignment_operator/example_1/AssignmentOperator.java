/*
Compilar dentro do diretorio example_1: javac AssignmentOperator.java
Executar dentro do diretorio example_1: java -cp ../ example_1.AssignmentOperator
*/

package example_1;

import java.util.Arrays;

public class AssignmentOperator {
    public static void main(String[] args) {

        /*
            Sinal de atribuição =
            Valor do lado direito será atribuido a variavel do lado esquerdo
            Variaveis de referencia aceita atribuição de uma instance de objeto ou null
            Tipos primitivos só aceitam o tipo primitivo, não aceitam null 
        */

        StringBuilder sb_1 = new StringBuilder();
        StringBuilder sb_2 = null;
        
        /* 
            Array eh considerado objeto e quando for instanciado,
            todos elementos do array receberam o valor default
            de acordo com cada tipo
        */
        String[] array_1 = null;
        String[] array_2 = new String[6];
        String[] array_3 = { "Billy", "Joy", "Allan" };
        int[] array_4 = new int[2];

        System.out.println(String.format("%s - %s - %s - %s",
                array_1, Arrays.toString(array_2),
                Arrays.toString(array_3),
                Arrays.toString(array_4)));

        int x = 6;

        // int y = null;            // não compila
    }
}