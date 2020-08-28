/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        /*
            Strings são imutáveis, ou seja, cada operação com a string resulta em uma nova string na memória.
            E para cada operação que não referencia a string, será perdido o objeto na memória

            Quando usada a keyword new, será criado dois objetos, um objeto do tipo String na heap(não pool)
            e outra no pool de string onde será colocada a string literal
        */

        String s = new String("abc"); // cria dois objetos e uma referencia
        System.out.println(s);

    }
}