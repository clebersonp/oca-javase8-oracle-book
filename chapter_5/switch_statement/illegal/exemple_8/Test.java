/*
Compilar dentro do diretorio example_8: javac Test.java
Executar dentro do diretorio example_8: java -cp ../ example_8.Test
*/

package example_8;

public class Test {
    public static void main(String[] args) {
        
        /*
            constants nos 'case' não podem duplicar o valor,
            caso contrario erro de compilação
        */

        int temp = 90;
        switch(temp) {
            case 90 { // não compila: Test.java:18: error: : expected
                System.out.println("Its 90");
            }
        }


        int x = 1;
        switch(x) {
            1: { System.out.println("Its 1"); } // não compila: Test.java:26: error: case, default, or '}' expected
        }
    }
}