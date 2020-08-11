/*
Compilar dentro do diretorio example_1: javac ComparePrimitives.java
Executar dentro do diretorio example_1: java -cp ../ example_1.ComparePrimitives
*/

package example_1;

public class ComparePrimitives {
    public static void main(String[] args) {

        System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
        System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
        System.out.println("5 != 6? " + (5 != 6));
        System.out.println("5.0 != 5L? " + (5.0 == 5L));
        System.out.println("true == false? " + (true == false));

    }
}