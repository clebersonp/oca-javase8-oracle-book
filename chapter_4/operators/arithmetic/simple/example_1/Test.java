/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        int x = 5 * 3;
        int y = x - 4;
        System.out.println("x - 4 is " + y);

        int a = 10;
        int b = a / 2 + 5;
        System.out.println("a / 2 + 5 is " + b);
    }
}