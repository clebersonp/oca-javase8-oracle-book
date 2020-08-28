/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            Strings são imutáveis, ou seja, cada operação com a string resulta em uma nova string na memória
        */

        String x = "Java";
        x.concat(" Rules!");
        System.out.println("x = " + x);
        
        x.toUpperCase();
        System.out.println("x = " + x);

        x.replace('a', 'x');
        System.out.println("x = " + x);

        x = x.concat(" STRING TIME"); // se quiser alterar o valor tem que recuperar o valor da operação e reatribuir a variavel
        x = x.toLowerCase();
        System.out.println("Apos reatribuir x = " + x);

    }
}