/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            trim()
            Returns a string whose value is this string, with any leading and trailing whitespace removed.
            "  name  " -> "name"

        */

        String x = "   hi   ";        
        System.out.println( x + "t" );
        System.out.println( x.trim() + "t" );
    }
}