/*
Compilar dentro do diretorio example_5: javac Test.java
Executar dentro do diretorio example_5: java -cp ../ example_5.Test
*/

package example_5;

public class Test {
    public static void main(String[] args) {

        /*
            1 - A primeira parte, declaração e inicialização é executada primeiro e somente uma vez;
            2 - A segunda parte (expressao boolean) eh verificada após a primeira parte e logo após a terceira parte;
            2 - A terceira parte (iteração) e executa sempre do chega ao fim do bloco do for;
        */

        for (int i = 9; i < 10; i++) {
            System.out.println("i is " + i);
        }
    }
}