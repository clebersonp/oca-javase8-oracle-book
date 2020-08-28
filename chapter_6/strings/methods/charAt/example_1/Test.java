/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            public char charAt(int index)
            Returns the char value at the specified index. An index ranges from 0 to length() - 1
            Throws:
                java.lang.StringIndexOutOfBoundsException: - if the index argument is negative or not less than the length of this string.
        */

        String x = "airplane";
        System.out.println( x.charAt(2) );
        System.out.println( x.charAt(7) );

        // System.out.println( x.charAt(8) ); // compila mas nao roda = StringIndexOutOfBoundsException

    }
}