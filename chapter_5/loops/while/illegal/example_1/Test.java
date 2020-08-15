/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        int x = 0;

        /*
            Compila e executa, porem, por não ter {} e ter mais de uma instrução, só executara
            o system.out.println, ou seja, somente a primeira instrução apos o while, e
            entrara num loop infinito imprimindo sempre o valor 0(zero);
        */
        while(x <= 2)
            System.out.println(x); x++;
    }
}