/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        
        /*
            public StringBuilder append(String str)
            Appends the specified string to this character sequence.
        */
        StringBuilder sb = new StringBuilder("set ");
        sb.append("point");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("pi = ");
        sb2.append(3.141519f);
        System.out.println(sb2);
    }
}