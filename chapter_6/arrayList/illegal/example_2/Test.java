/*
Compilar dentro do diretorio example_2: javac Test.java
*/

package example_2;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String [] args) {

        /*
            Exemplos de classes e operação com Wrappers
            Todos os tipos Wrappers são imutaveis

            variaveis de objets wrappers tambem pode não conter uma referencia, ou seja, ser null
        */

        ArrayList<String> coins = new ArrayList<String>();      // OK <String> em ambos lados

        ArrayList<String> names = new ArrayList<>();            // OK <String> so na declaracao

        ArrayList<> stuff = new ArrayList<String>();            // NOK, não compila <String> só do lado da criação do ArrayList: Test.java:24: error: illegal start of type
    }
}