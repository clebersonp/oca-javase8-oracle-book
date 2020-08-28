/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String [] args) {

        /*
            Exemplos de classes e operação com Wrappers
            Todos os tipos Wrappers são imutaveis
        */

        // essas operações eh o que acontece por debaixo dos panos pelo compilador
        Integer x = new Integer(567);
        int y = x.intValue();
        y++;
        x = new Integer(y);

        // a operação acima eh semelhante a esta, com diferença que o compilador faz o autoboxing, unboxing, increment e atribui novamente com autoboxing
        Integer i = new Integer(567);
        i++; // por mais que um Wrapper seja immutable, por conveniencia o compilador fara td por debaixo dos panos

        System.out.println(x);
        System.out.println(i);





        // Comprovando a imutabilidade de classe Wrapper

        Integer a = new Integer("15");
        Integer b = a;

        System.out.println(a + " " + b);
        System.out.println(a == b);

        a++;
        System.out.println(a + " " + b);
        System.out.println(a == b);


        /*
            Todas classes Wrappers, com exceção da Character, possuiem 2 construtores:
            1 - que recebe o proprio tipo primitivo;
            2 - que recebe sua representação como String;
            Ex:
                Integer(int value)
                Integer(String s)
        */

    }
}