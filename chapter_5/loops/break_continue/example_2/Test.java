/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

/*
    a keyword break eh usada para parar todo o bloco de execucao do loop mais interno;
    a keyword continue eh usada para parar somente a iteracao atual do loop mais interno, passando para a proxima iteracao

    continue só pode ser usado dentro de loops;
    break só pode ser usado dentro de loops e switch;
*/

public class Test {
    public static void main(String[] args) {
        
        /*
            break interrompe a execução do bloco do loop, porem somente no loop mais interno que estiver o break;
        */

        for (int i = 0; i < 10; i++) {
            System.out.println("Inside outter loop, value is " + i);
            for (int y = 0; y < 3; y++) {
                if (i > 2) {
                    break;
                }
                System.out.println("Inside inner loop, value is " + y);
            }
        }
    }
}