/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        /*
            For eh utilizado quando sabemos a quantidade de iterações que queremos fazer
            para repetir um bloco de instruções.

            O corpo do for eh constuido de 3 partes:
                1 - declaração e inicialização;
                2 - expressão boolean(teste condicional)
                3 - expressão de iteração(increment ou decrement)

            A primeira parte permite declarar e inicializar mais de uma variavel do mesmo tipo,
            caso tenha mais de uma variavel do mesmo tipo, deve ser separada por , e pode ser inicilizada
            com qualquer valor;

            A terceira parte pode controlar a iteração com mais de uma variavel, só separar as variaveis
            por ,
        */

        for (int i = 0, x = i; i < 10; i++, x--) {
            System.out.println("i is " + i + " and x is " + x);
        }
    }
}