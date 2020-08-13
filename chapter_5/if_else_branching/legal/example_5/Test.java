/*
Compilar dentro do diretorio example_5: javac Test.java
Executar dentro do diretorio example_5: java -cp ../ example_5.Test
*/

package example_5;

public class Test {
    public static void main(String[] args) {

        boolean examDone = true;
        double score = 0.60;

        /*
            Sempre quando não houver {}, a proxima instrução será executada quando a condição do if superior for atendida, sempre;
            Somente a primeira instrução abaixo de um if(condicional) true será executado

        */
        
        if (examDone) // verificou
        if (score < 0.61) // verificou pois examDone == true
        System.out.println("yeah score < 0.61."); // executou pois score eh menor que 0.61
        System.out.println("Try again."); // sempre executará pois está fora da estrutura do if
        

        /*
            Estrutura acima eh equivalente a estas:

            if (examDone) {
                if (score < 0.61) {
                    System.out.println("yeah score < 0.61.");
                }
            }
            System.out.println("Try again.");




            if (examDone)
                if (score < 0.61)
                    System.out.println("yeah score < 0.61.");
            System.out.println("Try again.");




            if (examDone)
                if (score < 0.61)
                    System.out.println("yeah score < 0.61.");
                    System.out.println("Try again.");
        */

    }
}