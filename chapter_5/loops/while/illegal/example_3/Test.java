/*
Compilar dentro do diretorio example_3: javac Test.java
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        /*
            Diferente de outras estruturas, o compilador aceita a estrutura do-while
            sem {}, porem só deve ter uma instrução entre do e while;
            O exemplo abaixo não compila pois tem mais de uma instrução entre
            do e while;
        */


        /*
            São todos equivalentes
        */
        do System.out.println("Inside loop"); System.out.println("Inside loop deep"); while(true); // Test.java:21: error: while expected

        /*
            do
            System.out.println("Inside loop"); // Test.java:25: error: while expected
            System.out.println("Inside loop deep");
            while(true);
        */

        /*
            do
                System.out.println("Inside loop"); // Test.java:31: error: while expected
                System.out.println("Inside loop deep");
            while(true);
        */
    }
}