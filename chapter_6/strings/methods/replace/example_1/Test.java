/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            replace(char oldChar, char newChar)
            Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
        */

        String x = "oxoxoxox";        
        System.out.println( x.replace('x', 'X') );
    }
}