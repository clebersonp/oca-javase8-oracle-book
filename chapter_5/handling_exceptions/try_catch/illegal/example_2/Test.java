/*
Compilar dentro do diretorio example_2: javac Test.java
*/

package example_2;


public class Test {
    public static void main(String[] args) {
        
        /*
            Bloco try - catch;
            Bloco try se arrisca e tentar executar as instruções, mas pode haver algum execption;
            Bloco catch, se caso uma exception seja lançada do mesmo tipo que o catch suporta(ou subtipo), será
            executas as instruções do catch;

            Não Pode existir bloco try sem catch ou sem finally;
        */

        try { // Test.java:21: error: 'try' without 'catch', 'finally' or resource declarations
            int i = 5, x = 0;
            double value = Test.divided(i, x);
            System.out.println("value is " + value);
        }

        System.out.println("end of execution.");
    }

    public static double divided(int i, int x) {
        // se o argumento x for igual a zero, então será lançada exception do tipo IllegalArgumentException
        if (x == 0) {
            throw new IllegalArgumentException(String.format("Não pode dividir por zero: i / x = %s/%s", i, x));
        }
        return i/x;
    }
}