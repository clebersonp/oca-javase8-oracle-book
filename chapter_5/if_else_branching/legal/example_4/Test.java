/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

public class Test {
    public static void main(String[] args) {

        boolean examDone = true;
        double score = 0.61;

        /*
            Sempre quando não houver {}, a proxima instrução será executada quando a condição do if superior for atendida, sempre;
            Somente a primeira instrução abaixo de um if(condicional) true será executado

        */

        if (examDone) // verificou
        if (score < 0.61) // verificou pois examDone == true
        System.out.println("Try again."); // não executou pois score não eh menor que 0.61 e sim igual
        else System.out.println("Java master"); // executou pois score == 0.61 e não menor

        /*
            Estrutura acima eh equivalente a esta:

            if (examDone) {
                if (score < 0.61) {
                    System.out.println("Try again.");
                } else {
                    System.out.println("Java master");
                }
            }

            Não se deixe enganar pela indentação. Sem exceções, somente a primeira instrução logo
            abaixo de uma condicional true do if que sera executada. Java não eh interpretado pelo
            compilador pela indentação, diferente de python;

            if (examDone)
                if (score < 0.61)
                    System.out.println("Try again.");
            else
                System.out.println("Java master");


        */

    }
}