/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        int z = 5;
        if (++z > 5 || ++z > 6) {
            z++;
            System.out.println("z is " + z);
        }

        int x = 5;

        /*
            not short-circuit & |;
            Sempre será validado os dois lados da operação, por isso not short-circuit
        */
        if (++x > 5 | ++x > 6) {
            x++;
            System.out.println("x is " + x);
        }
    }
}