/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            StringBuilder eh utilizado quando precisa realizar diversas modificações para string de caracteres.
            Diferente da class String, StringBuilder eh mutavel

            Prefira StringBuilder que StringBuffer:
            StringBuilder e StringBuffer possuem as mesmas operações, com exceção que StringBuilder não eh thread-safe,
            enquanto que, StringBuffer eh thread-safe e seus metodos são synchronized mais lenta por conta disso.
        */

        StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        System.out.println("sb = " + sb);

        /*
            Podem ser encadeadas as chamadas, e a ordem de execução das chamadas eh da esquerda para direita.
        */
        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("def").reverse().insert(3,"---");
        System.out.println("sb2 = " + sb2);

        /*
            Construtores:

            StringBuilder()
            Constructs a string builder with no characters in it and an initial capacity of 16 characters.

            StringBuilder(String str)
            Constructs a string builder initialized to the contents of the specified string.

            StringBuilder(int capacity)
            Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
        */

    }
}