/*
    Compilar dentro do diretorio example_1: javac Casting.java
    Executar dentro do diretorio example_1: java -cp ../ example_1.Casting
*/

package example_1;

public class Casting {
    public static void main(String[] args) {

        int a = 395.468;            // não compila, large-value-into-small-container precisa de explicit cast
        float b = 32.2;             // não compila
        byte c = 128;               // não compila

        
    }
}