/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            public int length()
            Returns the length of this string. The length is equal to the number of Unicode(16-bit) code units in the string.

            String tem o metodo length();

            Array tem o atributo length;
        */

        String x = "01234567";        
        System.out.println( x.length() );
    }
}