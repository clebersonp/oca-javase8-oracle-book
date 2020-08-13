/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        int x = 3;

        /*
            Switch aceita qualquer tipo primitivo que possa ser feito cast implicito para int, ou seja,
            char, byte, short, int. E pode ser usado Enum e String
        */

        // estrutura completa do switch
        switch (x) {
            case 1:
                System.out.println("x equals 1");
                break;
            case 2:
                System.out.println("x equals 2");
                break;
            default:
                System.out.println("No idea what x is");
        }

        // equivalencia com if
        if (x == 1) {
            System.out.println("x equals 1");
        } else if (x == 2) {
            System.out.println("x equals 2");
        } else {
            System.out.println("No idea what x is");
        }
        
    }
}