/*
Compilar dentro do diretorio example_4: javac Test.java
*/

package example_4;

public class Test {
    public static void main(String[] args) {

        /*
            não compila pois a estrutura do-while exige ; após a instrução while(expressao-boolean)
        */

        do {
            System.out.println("Inside loop");
        } while(false) // Test.java:18: error: ';' expected

        do System.out.println("Inside loop"); while(true) // Test.java:20: error: ';' expected

    }
}