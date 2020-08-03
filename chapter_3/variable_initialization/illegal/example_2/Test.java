/*
    Compilar dentro do diretorio example_2: javac Test.java
*/

package example_1;

import java.util.Arrays;

public class Test {
    
    public static void main(String[] args) {
        new Test().go(args);
    }


    /* 
        Não Compila, variaveis locais não tem valor default para nenhum tipo,
        nem primitivo nem de referencia.
        Isso causa erro de compilacao dizendo que a variavel nao foi inicializada;
    */
    void go(String[] args) {

        // Variavel local deve ser inicializada antes de tentar usa-la, caso contrario tera erro de compilacao
        String [] cities;
        int size;

        System.out.println(String.format("Tentando acessar a variavel "
            + "local cities array de String sem inicializa-la: %s", Arrays.toString(cities)));
        
        System.out.println(String.format("Tentando acessar a variavel "
            + "local size do tipo int sem inicializa-la: %s", size));

        int num;
        if (args[0] != null) {
            num = 7;
        }
        System.out.println(String.format("Tentando usar a variavel local 'num' do tipo "
            + "int que pode não ser inicializada apos o bloco do if: %s", num));            // não compila, por conta do bloco de condicao if, a variavel local num pode ser inicializada ou nao, o compilador nao permite
    }
}