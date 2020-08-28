/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        
        /*
            public StringBuilder insert(int offset, String str)
            Inserts the string into this character sequence.
            The offset argument must be greater than or equal to 0, and less than or equal to the length of this sequence.

            Throws:
            StringIndexOutOfBoundsException - if the offset is invalid.

        */
        StringBuilder sb = new StringBuilder("01234567");
        sb.insert(8,89);
        sb.insert(5, "----");
        System.out.println(sb);
    }
}