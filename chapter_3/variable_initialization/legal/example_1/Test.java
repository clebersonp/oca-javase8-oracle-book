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
    String address;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bo;
    char c;                 // valor default em unicode: '\u0000' = vazio
    int [] years;           // arrays tambem são objetos, portanto, o valor default eh null
    boolean [] hasInitialized = new boolean[5]; // quando o array eh inicializado, todos os elementos recebem o valor default, independentemente de ser array de instancia ou local

    public static void main(String[] args) {
        new Test().go();
    }

    void go() {

        String [] cities = new String[2];
        int ages [] = new int[2];
        boolean notInitializedAndNotUsed;               // O compilador permite declarar variaveis locais sem inicializa-las, não tem problema desde que não a utilize;
        long length;                                    // Declara variavel length do tipo long sem inicializa-la



        System.out.println(String.format("String name: %s, byte b: %s, "
            + "short s: %s, int i: %s, long l: %s, float f: %s, "
            + "double d: %s, boolean bo: %s, char c: %s",
            name, b, s, i, l, f, d, bo, c));

        address = "Some address after default initialization";
        if (address != null) {
            System.out.println(String.format("Address is not null and its value in uppercase is '%s'", address.toUpperCase()));
        }

        System.out.println(String.format("Valor da referencia do array de instancia years: %s", years));
 
        System.out.println(String.format("Valor dos elementos do array de instancia hasInitialized default: %s",
            Arrays.toString(hasInitialized)));
 
        System.out.println(String.format("Valores default do array local ages do tipo int: %s",
            Arrays.toString(ages)));
 
        System.out.println(String.format("Valores defaul dos elementos do array local cities do tipo String: %s",
            Arrays.toString(cities)));


        length = 15L;                                   // Inicializa a variavel length do tipo long antes de usa-la
                System.out.println(String.format("Usando variavel local 'length' do tipo "
                + "long apos declara-la e inicializa-la em duas etapas: %s", length));

        String country = null; // variavel de referencia local deve ser inicializa até mesmo com null se desejar utiliza-la e fazer a verificacao != null
        System.out.println(String.format("Verificando uma variavel de referencia "
            + "local inicializada com null se eh diferente de null: %s", country));
    }
}