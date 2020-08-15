/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

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

            Embora a primeira e terceeira parte podem ter mais de uma instrução separadas por ,
            a segunda instrução permite somente UMA expressão boolean;
        */

        for (int i = 0, x = i; (((i < 10) && (x > -11)) | x == i); i++, x--) {
            System.out.println("i is " + i + " and x is " + x);
        }
    }
}