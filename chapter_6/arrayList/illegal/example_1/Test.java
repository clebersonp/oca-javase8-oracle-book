/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.util.List;
import java.util.ArrayList;

public class Test {

    static Integer x;

    public static void main(String [] args) {

        /*
            Exemplos de classes e operação com Wrappers
            Todos os tipos Wrappers são imutaveis

            variaveis de objets wrappers tambem pode não conter uma referencia, ou seja, ser null
        */

        doSuff(x);
    }

    static void doSuff(int z) {
        int z2 = 5;
        System.out.println(z2 + z); // compila normalmente, porem ao executar dá nullpointer: Exception in thread "main" java.lang.NullPointerException
    }

}