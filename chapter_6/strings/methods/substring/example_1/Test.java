/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            substring(int beginIndex)
            Returns a string that is a substring of this string.
            Throws:
            IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object.

            substring(int beginIndex, int endIndex)
            beginIndex - the begin index, inclusive.
            endIndex - the end index, exclusive.
            Returns a string that is a substring of this string.
            IndexOutOfBoundsException - if the beginIndex is negative, or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex.
        */

        String x = "0123456789";        
        System.out.println( x.substring(5) );
        System.out.println( x.substring(5, 8) ); // endIndex eh o tamanho total, se for trata-lo com index tem que subtrair 1, ou seja, index 7
    }
}