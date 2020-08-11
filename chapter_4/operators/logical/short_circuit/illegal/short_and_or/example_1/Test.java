/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        if (x && y) {
            // não compila, short-circuit logical só pode ser usado com boolean expressions
            // bad operand types for binary operator '&&'
        }

        if (y || x) {
            // não compila, short-circuit logical só pode ser usado com boolean expressions
            // error: bad operand types for binary operator '||'
        }
    }
}