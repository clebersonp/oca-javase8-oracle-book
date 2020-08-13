/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        /*
            Estrutura aceita, porem pouco legivel
        */

        int x = 1;
        if ( x == 3 ) { }
        else if (x > 4) { System.out.println(">4"); }
        else if (x > 2) { System.out.println(">2"); }
        else if (x < 4) { System.out.println("<4"); }
        else { System.out.println("else"); }

    }
}