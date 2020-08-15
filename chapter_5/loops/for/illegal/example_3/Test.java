/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        /*
            quando o for não tiver {} somente a primeira instrução logo apos o for será executada
            enquanto a expressão boolean for verdadeira;

            Neste caso não compila, pois o segundo print está tentando acessar variaveis locais,
            que foram definidas no body do for;
        */

        /*
            As estruturas são equivalentes;
        */

        for (int i = 0, x = i; i < 10; i++, x--) System.out.println("i is " + i + " and x is " + x); System.out.println("i is " + i + " and x is " + x);

        for (int i = 0, x = i; i < 10; i++, x--)
        System.out.println("i is " + i + " and x is " + x);
        System.out.println("i is " + i + " and x is " + x);

        for (int i = 0, x = i; i < 10; i++, x--)
            System.out.println("i is " + i + " and x is " + x);
            System.out.println("i is " + i + " and x is " + x);

        for (int i = 0, x = i; i < 10; i++, x--)
            System.out.println("i is " + i + " and x is " + x);
        System.out.println("i is " + i + " and x is " + x);

    }
}