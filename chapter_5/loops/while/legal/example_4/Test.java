/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

public class Test {
    public static void main(String[] args) {

        /*
            Diferente de outras estruturas, o compilador aceita a estrutura do-while
            sem {}, porem só deve ter uma instrução entre do e while;
            O exemplo abaixo fica em loop infinito;
        */


        /*
            São todos equivalentes
        */
        // do System.out.println("Inside loop"); while(true);

        /*
            do
            System.out.println("Inside loop");

            while(true);
        */
        
        do
            System.out.println("Inside loop");
        while(true);

    }
}