/*
    Compilar dentro do diretorio example_1: javac Test.java
    Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.util.Arrays;

public class Test {
    
    /*
        Variaveis de instancia são inicializadas com valores default
        e são inicializadas ao criar o objeto no heap;
    */

    // variaveis de instancia de objetos tem por default o valor null que é diferente de "" vazio;
    // null significa que a referencia não aponta para nenhum objeto no heap
    String name;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bo;
    char c;                 // valor default em unicode: '\u0000' = vazio

    public static void main(String[] args) {
        new Test().go();
    }


    // Compila, mas ao executar ocorre NullPointerException
    void go() {

        // Variavel local deve ser inicializada antes de tentar usa-la, caso contrario tera erro de compilacao
        String [] cities;


        System.out.println(String.format("String name: %s, byte b: %s, "
            + "short s: %s, int i: %s, long l: %s, float f: %s, "
            + "double d: %s, boolean bo: %s, char c: %s",
            name.toUpperCase(), b, s, i, l, f, d, bo, c));                              // null pointer pois a variavel de instancia 'name' ainda não foi inicializada, ou seja, o seu valor default ainda eh null

        System.out.println(String.format("Tentando acessar uma variavel "
            + "local sem inicializa-la: %s", Arrays.toString(cities)));
    }
}