/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            public String toString()
            This object (which is already a string!) is itself returned.
        */

        String x = "big surprise";        
        System.out.println( x.toString() ); // String overrides toString from Object
    }
}