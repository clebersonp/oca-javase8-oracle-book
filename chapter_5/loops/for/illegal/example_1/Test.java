/*
Compilar dentro do diretorio example_1: javac Test.java
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            não compila pois o compilador lê o body do for da esquerda para direita,
            e como a variavel da direita ainda não foi inicializada, a variavel da esquerda
            não eh valida;
        */
        for (int i = x, x = 0; i < 10; i++, x--) { // Test.java:15: error: cannot find symbol
            System.out.println("i is " + i + " and x is " + x);
        }
    }
}