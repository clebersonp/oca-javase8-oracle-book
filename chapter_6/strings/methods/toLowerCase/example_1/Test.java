/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            toLowerCase()
            Converts all of the characters in this String to lower case using the rules of the default locale.
        */

        String x = "A new Moon";        
        System.out.println( x.toLowerCase() );
    }
}