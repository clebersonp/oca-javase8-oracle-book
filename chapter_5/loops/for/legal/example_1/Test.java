/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            For eh utilizado quando sabemos a quantidade de iterações que queremos fazer
            para repetir um bloco de instruções.

            O corpo do for eh constuido de 3 partes:
                1 - declaração e inicialização;
                2 - expressão boolean(teste condicional)
                3 - expressão de iteração(increment ou decrement)
        */

        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
        }
    }
}