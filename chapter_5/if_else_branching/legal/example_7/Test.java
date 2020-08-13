/*
Compilar dentro do diretorio example_7: javac Test.java
Executar dentro do diretorio example_7: java -cp ../ example_7.Test
*/

package example_7;

public class Test {
    public static void main(String[] args) {

        int y = 5;
        int x = 2;

        /*
            estrutura condicional if e else if só aceitam valores boolean ou expressões que resultam em um valor boolean,
            fora disse eh invalido
        */

        // por causa da ordem de precedencia UMARELSA, após verificar os (), será validado operador logico | antes dos
        // operadores logicos short-circuit &&
        if ((x > 3) && (y < 2) | doStuff()) {
            System.out.println("true");
        } else {
            System.out.println("printing nothing....");
        }

    }

    public static boolean doStuff() {
        return true;
    }
}