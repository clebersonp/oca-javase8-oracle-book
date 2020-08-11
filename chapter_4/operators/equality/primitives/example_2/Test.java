/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        boolean b = false;
        /*
            Essa operação é legal somente para tipos boolean, porem estranha.
            Ficar atendo no exame quando é comparação == e quando é atribuição =
        */
        if (b = true) { System.out.println("b is true");
        } else { System.out.println("b is false"); }

        int x = 1;
        // não compilar pois a atribuição resulta em um int e não em um boolean
        // if (x = 1) { }
        if (x == 1) { System.out.println("x is 1"); }

    }
}