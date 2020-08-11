/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;


/*
4 compound assignment operators usados no exam: +=, -=, *=, /=
*/

public class Test {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int y = 0;
        int x = 0;

        // operações sem compound operators
        a = a - 6;
        b = b + 2 * 5;
        System.out.println(String.format("without compound operators: a = %s, b = %s", a, b));


        // operações com compound operators
        y -= 6;
        x += 2 * 5;
        System.out.println(String.format("with compound operators: y = %s, x = %s", y, x));


    }
}