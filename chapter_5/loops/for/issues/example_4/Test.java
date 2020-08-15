/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

public class Test {
    public static void main(String[] args) {

        /*
            As tres partes são independentes e o seguinte codigo eh valido
        */

        int b = 3;
        for (int a = 1; b != 1; System.out.println("iterate")) {
            b = b - a;
        }

    }
}