/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        
        /*
            public StringBuilder reverse()
            Causes this character sequence to be replaced by the reverse of the sequence.

        */
        StringBuilder sb = new StringBuilder("A man a plan a canal Panama");
        sb.reverse();
        System.out.println(sb);
    }
}