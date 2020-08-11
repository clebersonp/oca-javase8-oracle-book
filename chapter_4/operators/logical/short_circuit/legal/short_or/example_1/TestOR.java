/*
Compilar dentro do diretorio example_1: javac TestOR.java
Executar dentro do diretorio example_1: java -cp ../ example_1.TestOR
*/

package example_1;

public class TestOR {
    public static void main(String[] args) {
        
        /*
            || = só avalia expressoes booleans;
            só será true, se pelo menos uma das expressoes for true;
            só avalia o lado direito se o lado esquerdo for false, por isso eh chamado de short-circuit
        */
        if ((isItSmall(3)) || (isItSmall(7))) {
            System.out.println("Result is true");
        }

        if ((isItSmall(6)) || (isItSmall(9))) {
            System.out.println("Result is true");
        }
    }

    public static boolean isItSmall(int i) {
        if (i < 5) {
            System.out.println("i < 5");
            return true;
        } else {
            System.out.println("i >= 5");
            return false;
        }
    }
}