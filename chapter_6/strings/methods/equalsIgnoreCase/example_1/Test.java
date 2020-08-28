/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            equalsIgnoreCase(String anotherString)
            Compares this String to another String, ignoring case considerations.
        */

        String x = "Exit";        
        System.out.println( x.equalsIgnoreCase("EXIT") ); // true
        System.out.println( x.equalsIgnoreCase("tixe") ); // false

    }
}