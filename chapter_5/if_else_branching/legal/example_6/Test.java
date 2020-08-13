/*
Compilar dentro do diretorio example_6: javac Test.java
Executar dentro do diretorio example_6: java -cp ../ example_6.Test
*/

package example_6;

public class Test {
    public static void main(String[] args) {

        int y = 5;
        int x = 2;

        /*
            estrutura condicional if e else if só aceitam valores boolean ou expressões que resultam em um valor boolean,
            fora disse eh invalido
        */

        if (((x < 3) && (y < 2)) | doStuff()) {
            System.out.println("true");
        }

    }

    public static boolean doStuff() {
        return true;
    }
}