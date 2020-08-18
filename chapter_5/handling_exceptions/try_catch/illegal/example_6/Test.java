/*
Compilar dentro do diretorio example_6: javac Test.java
*/

package example_6;


public class Test {
    public static void main(String[] args) {
        
        /*
            Bloco try - catch;
            O primeiro bloco catch precisa ser apos do bloco try;
            Não existe bloco catch sem try, ou finally sem try;
            
            Todo bloco catch ou finally deve ser exatamente após um bloco try;
        */

        try { // Test.java:20: error: 'try' without 'catch', 'finally' or resource declarations
            int i = 5, x = 0;
            double value = Test.divided(i, x);
            System.out.println("value is " + value);
        } catch (IllegalArgumentException e) { // Test.java:26: error: 'catch' without 'try'
            System.out.println(e.getMessage());
        }
        System.out.println("} after try bloc"); // não compila pois essa instrução esta entre os blocos catch e finally
        finally { // Test.java:27: error: 'finally' without 'try'
            System.out.println("Finally");
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