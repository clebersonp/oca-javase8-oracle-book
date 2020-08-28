/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String [] args) {

        /*
            Exemplos de classes e operação com Wrappers
            Todos os tipos Wrappers são imutaveis
        */

        Test test = new Test();
        test.go(5); // passando tipo primitivo
    }

    public boolean go(Integer i ) {         // boxing int to Integer
        Boolean ifSo = true;                // boxing literal
        Short s = 300;                      // boxing the primitive
        if (ifSo) {                         // unboxing
            System.out.println(++s);        // unboxing, increments, reboxing
        }
        return !ifSo;                       // unboxing, return the reverse
    }

}