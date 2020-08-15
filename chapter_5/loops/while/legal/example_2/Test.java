/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        int x = 8;

        /*
            o while é checado sempre antes de iniciar e durante sua execução, por isso,
            se a expressão começar com false não sera executado o loop;
        */

        while(x > 8) {
            System.out.println("in the loop");
            x = 10;
        }
        System.out.println("past the loop");
    }
}