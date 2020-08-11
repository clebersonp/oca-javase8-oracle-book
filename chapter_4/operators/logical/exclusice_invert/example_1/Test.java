/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        System.out.println("xor: " + ((2 > 3) ^ (4 < 3)));
        System.out.println("xor: " + ((2 < 3) ^ (4 > 3)));

        /*
            ^ = Exclusive Or = XOR;
            eh not short-circuit, ou seja, avalia as duas expressoes booleans;
            só pode ser usado com operacoes booleans;
            só será true, se apenas uma das expressoes for verdadeira, false caso contrário
        */
        System.out.println("xor: " + ((2 < 3) ^ (1 > 3)));


        /*
            ! só pode ser usado em valores ou expressoes booleans;
            inverte o valor boolean atual;
        */
        if (!(7 == 5)) {
            System.out.println("not equals");
        }
    }
}