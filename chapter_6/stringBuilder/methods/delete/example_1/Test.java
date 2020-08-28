/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        
        /*
            delete(int start, int end)
            start - The beginning index, inclusive. baseado no zero(0)
            end - The ending index, exclusive. baseado no um(1)
            Removes the characters in a substring of this sequence.
            
            Throws:
            StringIndexOutOfBoundsException - if start is negative, greater than length(), or greater than end.

        */
        StringBuilder sb = new StringBuilder("0123456789");
        System.out.println(sb.delete(4,6));
    }
}