/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        int x = 4, y = 0, z = 1, a = 0;

        /*
            Quando não usado {} no if só será executada a primeira instrução logo após o if,
            independente de estar indentado ou não
        */
        if (x > 3)
        y = 2;
        z += 8;
        a = y + x;

        /*
            Os resultados são iguais ao exemplo acima:

            if (x > 3)
                y = 2;
            z += 8;
            a = y + x;



            if (x > 3)
                y = 2;
                z += 8;
                a = y + x;
        */

        System.out.println(String.format("x = %s; y = %s; z = %s, a = %s", x, y, z, a));
    }
}