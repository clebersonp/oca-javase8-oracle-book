/*
Compilar dentro do diretorio exercise_3: javac Test.java
Executar dentro do diretorio exercise_3: java -cp ../ exercise_3.Test
*/

package exercise_3;

public class Test {
    public static void main(String[] args) {
        
        /*
        
            Given:
                try { int x = Integer.parseInt("two"); }

                Which exception could be used to create an appropriate catch block?

        */

        try { int x = Integer.parseInt("two"); }
        catch (NumberFormatException e) { System.out.println(e); }
        catch (IllegalArgumentException e) { System.out.println(e); }

    }
    // Result: NumberFormatException
}