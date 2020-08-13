/*
Compilar dentro do diretorio example_7: javac Test.java
Executar dentro do diretorio example_7: java -cp ../ example_7.Test
*/

package example_7;

public class Test {
    public static void main(String[] args) {
        
        /*
            constants nos 'case' não podem duplicar o valor,
            caso contrario erro de compilação
        */

        int temp = 90;
        switch(temp) {
            case 80:
            case 80: // não compila: Test.java:14: error: duplicate case label
            case 90: System.out.println("Its 90");
        }
    }
}