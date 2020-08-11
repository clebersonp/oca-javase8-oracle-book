/*
Compilar dentro do diretorio example_1: javac Logical.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Logical
*/

package example_1;

public class Logical {
    public static void main(String[] args) {
        boolean b1 = false, b2 = false;

        /*
            && = só avalia expressoes booleans;
            só será true, se ambas expressoes forem true;
            só avalia o lado direito se o lado esquerdo for verdadeiro, por isso eh chamado de short-circuit
        */

        boolean b3 = (b1 == true) && (b2 == true);
        System.out.println(b3 + " " + b2);
    }
}