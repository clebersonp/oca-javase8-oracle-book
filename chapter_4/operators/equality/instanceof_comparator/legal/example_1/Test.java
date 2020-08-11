/*
    Compilar dentro do diretorio example_1: javac Test.java
    Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        String s = new String("foo");

        /*
            verifica se o objeto referenciado pela variavel do lado esquerdo
            passa no teste IS-A para um tipo de class ou interface do lado direito.
            instanceof não pode ser usado por tipos que não tem hierarquia ou implements uma interface, ou seja, subtype,
            caso contrario terá erro de compilação
        */

        if (s instanceof String) {
            System.out.println("s is a String");
        }
    }
}