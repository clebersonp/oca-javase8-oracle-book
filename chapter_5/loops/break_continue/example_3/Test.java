/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

/*
    a keyword break eh usada para parar todo o bloco de execucao do loop mais interno;
    a keyword continue eh usada para parar somente a iteracao atual do loop mais interno, passando para a proxima iteracao

    continue só pode ser usado dentro de loops;
    break só pode ser usado dentro de loops e switch;
*/

public class Test {
    public static void main(String[] args) {
        
        /*
            continue interrompe somente a iteracao atual do bloco do loop, porem somente no loop mais interno que estiver o continue;
        */

        int i = 0;
        while(i < 10) {
            System.out.println("Inside outter loop, value is " + i);
            
            int y = 0;

            while(y < 3) {
                y++;
                if (i == 2 || i == 5) {
                    continue;
                }
                System.out.println("Inside inner loop, value is " + y); // não vai imprimir o valor quando i == 2 ou i == 5 por causa do continue
            }
            i++;
        }
    }
}