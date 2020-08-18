/*
Compilar dentro do diretorio example_1: javac Test.java
*/

package example_1;


public class Test {
    public static void main(String[] args) {
        
        /*
            Bloco try - catch;
            O primeiro bloco catch precisa ser apos do bloco try;
            Não existe bloco catch sem try, ou finally sem try;
            Não pode existir só o bloco try
        */

        
        int i = 5, x = 0;
        double value = Test.divided(i, x);
        System.out.println("value is " + value);
        catch (IllegalArgumentException e) { // Test.java:23: error: 'catch' without 'try'
            System.out.println(e.getMessage());
        }
    }

    public static double divided(int i, int x) {
        // se o argumento x for igual a zero, então será lançada exception do tipo IllegalArgumentException
        if (x == 0) {
            throw new IllegalArgumentException(String.format("Não pode dividir por zero: i / x = %s/%s", i, x));
        }
        return i/x;
    }
}