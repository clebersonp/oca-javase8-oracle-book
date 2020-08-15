/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        int x = 0;

        /*
            While eh utilizado quando não sabemos quantas vezes deve ser executado
            um bloco de codigo ou instrução, mas que pode ser executado n vezes até
            que a condição seja false;

            No argumento do while só aceita expressões boolean, qualquer coisa diferente
            não compila;
        */

        while(x <= 2) {
            System.out.println(x);
            x++;
        }
    }
}