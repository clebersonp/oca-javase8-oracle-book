/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        boolean examDone = true;
        double score = 0.60;

        /*
            Não compila pois após a instrução else System.out.println("Java master"); está sem seu if, ou seja,
            quando não tem {} toda condição atingida do if será executada a primeira instrução abaixo, por tanto,
            existem 2 instruções após if (score < 0.61) e por isso o else sozinho dá problema

        */

        if (examDone)
        if (score < 0.61)
        System.out.println("score < 0.61");
        System.out.println("Try again.");
        else System.out.println("Java master");

        /*
            Estrutura acima eh equivalente a esta:

            if (examDone) {
                if (score < 0.61) {
                System.out.println("score < 0.61");
                }
            }
            System.out.println("Try again.");
            else System.out.println("Java master");

        */

    }
}