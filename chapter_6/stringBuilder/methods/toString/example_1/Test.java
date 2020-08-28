/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        
        /*
            public String toString()
            Returns a string representing the data in this sequence.

        */
        StringBuilder sb = new StringBuilder("test String");
        System.out.println(sb.toString());
    }
}