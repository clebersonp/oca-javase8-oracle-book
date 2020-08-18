/*
Compilar dentro do diretorio example_3: javac Test.java
*/

package example_3;


public class Test {
    public static void main(String[] args) {
        
        /*
            Bloco try - catch;
            Bloco try se arrisca e tentar executar as instruções, mas pode haver algum execption;
            Bloco catch, se caso uma exception seja lançada do mesmo tipo que o catch suporta(ou subtipo), será
            executas as instruções do catch;

            Bloco finally sempre eh executado ou depois de um try ou depois do catch, ou seja, existindo ou não exception
            sempre será executado. Bloco utilizado para finalizar um recurso, por execption, fechar um conexão

            Todo try é seguido por catch e finally ou só catch ou só finally, mas não é permitido só o bloco try;

            Pode existir um bloco de try-catch, try-multi-catchs, try-catch-finally, try-muilt-catch-finally, try-finally

            Não pode existir somente um bloco finally sem um bloco catch ou try;
        */

        
        int i = 5, x = 0;
        double value = Test.divided(i, x);
        System.out.println("value is " + value);
        finally { // Test.java:32: error: 'finally' without 'try'
            System.out.println("Finally block always run");
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