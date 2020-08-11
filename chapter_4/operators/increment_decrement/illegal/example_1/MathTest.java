/*
Compilar dentro do diretorio example_1: javac MathTest.java
*/

package example_1;

public class MathTest {
    static final int players = 0;
    public static void main(String[] args) {

        // increment postfix,
        // não compila pois players eh final.
        // e final não pode ser alterado depois de inicializada
        // error: cannot assign a value to final variable players
        System.out.println("players online: " + players++);
    }
}