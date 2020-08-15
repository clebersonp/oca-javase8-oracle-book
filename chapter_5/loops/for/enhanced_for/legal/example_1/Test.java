/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        int [] a = { 1, 2, 3, 4 };
        for (int x = 0; x < a.length; x++) {
            System.out.println("a[" + x + "] = " + a[x]);
        }

        /*
            enhanced for:
            Possui duas partes:
            1 - declara o tipo do array ou collection para receber
                o valor da iteracao e a variavel será local ao bloco do for (declaracao)
            2 - lado direito deve ser um array ou collection (expressao)
        */

        for (int value : a) {
            System.out.println("value is " + value);
        }

    }
}