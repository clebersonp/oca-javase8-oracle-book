/*
Compilar dentro do diretorio example_1: javac MathTest.java
Executar dentro do diretorio example_1: java -cp ../ example_1.MathTest 
*/

package example_1;

public class MathTest {
    public static void main(String[] args) {
        int x = 15;
        int y = x % 4;
        System.out.println("The result of 15 % 4 is the remainder of 15 divided by 4. The remainder is " + y);
    }
}