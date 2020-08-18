/*
Compilar dentro do diretorio example_8: javac Test.java
*/

package example_8;


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

            Varios catchs com tipos de exceptions diferentes eh chamado de "exception matching" e a ordem do tipo importa.
            Top down - sempre do tipo mais especifico para o tipo mais generico(quando se tratar de exceptions de mesma hierarquia),
            caso contrario não compila
        */

        try {
            Integer i = 5, x = 5;
            double value = Test.divided(i, x);
            System.out.println("value is " + value);
        } catch (Exception e) { // não compila pois a exception mais generica precisa se a ultima nos catchs
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) { // Test.java:34: error: exception IllegalArgumentException has already been caught
            System.out.println(e.getMessage());
        } catch (NullPointerException e) { // Test.java:36: error: exception NullPointerException has already been caught
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block always run");
        }
    }

    public static double divided(Integer i, Integer x) {
        
        if (i == null || x == null) {
            throw new NullPointerException("Values i or x can't be Null");
        }

        // se o argumento x for igual a zero, então será lançada exception do tipo IllegalArgumentException
        if (x == 0) {
            throw new IllegalArgumentException(String.format("Não pode dividir por zero: i / x = %s/%s", i, x));
        }
        double result = i/x;

        if (result == 1) {
            throw new RuntimeException(String.format("Result don't be equals '%s'", result));
        }
        return result;
    }
}