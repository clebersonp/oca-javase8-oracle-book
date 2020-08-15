/*
Compilar dentro do diretorio example_2: javac Test.java
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        for (int i = 0, x = 0; i < 10; i++, x--) {
            System.out.println("i is " + i + " and x is " + x);
        }

        /*
            não compila: Test.java:14: error: cannot find symbol x and i

            As variaveis declaradas no body do for são de escopo local, ou seja,
            só existem dentro do bloco do for;

        */
        System.out.println("i is " + i + " and x is " + x);
    }
}