/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            public String concat(String str)
            Concatenates the specified string to the end of this string.
        */

        String x = "taxi";
        x = x.concat(" cab");
        System.out.println(x);

        String y = "Atlantic";
        y += " ocean"; // operador += funciona como o concat e atribuicao
        System.out.println(y);

    }
}