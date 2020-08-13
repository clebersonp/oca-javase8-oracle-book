/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        double x = 3.0;

        /*
            Switch aceita qualquer tipo primitivo que possa ser feito cast implicito para int, ou seja,
            char, byte, short, int. E pode ser usado Enum e String
        */

        // não compila, pois para converter double para int precisa de cast explicito
        switch (x) {
            case 1.0:
                System.out.println("x equals 1.0");
                break;
            case 2.0:
                System.out.println("x equals 2.0");
                break;
            default:
                System.out.println("No idea what x is");
        }
        
    }
}