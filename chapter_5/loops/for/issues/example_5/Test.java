/*
Compilar dentro do diretorio example_5: javac Test.java
Executar dentro do diretorio example_5: java -cp ../ example_5.Test
*/

package example_5;

public class Test {
    public static void main(String[] args) {

        /*
            As tres partes são independentes e o seguinte codigo eh valido
        */

        int b = 5;
        int a;
        for (a = Test.initValue(); Test.valid(b); System.out.println("iterate")) {
            b = b - a;
        }

    }

    public static boolean valid(int value) {
        return value > 0;
    }

    public static int initValue() {
        return 1;
    }
}