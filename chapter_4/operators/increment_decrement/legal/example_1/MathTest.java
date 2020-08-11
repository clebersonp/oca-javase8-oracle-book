/*
Compilar dentro do diretorio example_1: javac MathTest.java
Executar dentro do diretorio example_1: java -cp ../ example_1.MathTest
*/

package example_1;

public class MathTest {
    static int players = 0;
    public static void main(String[] args) {

        // increment postfix, primeiro eh utilizada o valor da variavel e depois eh incrementado 1 na variavel player
        System.out.println("players online: " + players++);
        System.out.println("The value of players is: " + players);
        
        // increment prefix, primeiro eh incrementado 1 na variavel player e depois eh utilizada o valor da variavel
        System.out.println("The value of players is now: " + ++players);


        int x = 2, y = 3;

        if ((y == x++) | (x < ++y)) {
            System.out.println("x = " + x + " y = " + y);
        }
    }
}