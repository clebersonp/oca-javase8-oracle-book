/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String [] args) {

        /*
            Exemplos de classes Wrappers com operadores == e equals()

            Para otimizar a memoria, duas instancias das classes wrappers abaixo(criado atraves do boxing)
            sempre serão == quando elas tiverem o valor primitivo iguais:

                Boolean;
                Byte;
                Character de \u0000 até \u007f(7f eh 127 em decimal)
                Short e Integer de -128 até 127;
            
        */

        Integer i1 = 1000; // passou de 127 então == não funcionara quando tiver outro objeto do mesmo tipo com o mesmo valor
        Integer i2 = 1000;
        if (i1 == i2) System.out.println("equals objects i1 == i2");
        if (i1 != i2) System.out.println("different objects i1 != i2");
        if (i1.equals(i2)) System.out.println("mesmo conteudo i1.equals(i2)");
        if (i1.intValue() == i2.intValue()) System.out.println("mesmo conteudo i1.intValue() == i2.intValue()");
        
        Integer i3 = 127;
        Integer i4 = 127;
        if (i3 == i4) System.out.println("same objects i3 == i4");
        if (i3 != i4) System.out.println("different objects i3 != i4");
        if (i3.equals(i4)) System.out.println("same value i3.equals(i4)");
        

        Integer i5 = 1; // com a classe wrapper boxing, (a == b) sera true e (a != b) será false de o valor estiver entre -128 ate 127
        Integer i6 = 1;
        if (i5 == i6) System.out.println("same objects i5 == i6");
        if (i5 != i6) System.out.println("different objects i5 != i6");
        if (i5.equals(i6)) System.out.println("equals values i5.equals(i6)");


        Character c = 0;
        Character d = 0;
        System.out.println(String.format("c == d? %s", c == d));
        System.out.println(String.format("c != d? %s", c != d));


        Character e = 127;
        Character f = 127;
        System.out.println(String.format("e == f? %s", e == f));
        System.out.println(String.format("e != f? %s", e != f));


        Character g = 128; // passou de 127 então == não funcionara quando tiver outro objeto do mesmo tipo com o mesmo valor
        Character h = 128;
        System.out.println(String.format("g == h? %s", g == h));
        System.out.println(String.format("g != h? %s", g != h));


        Integer i = -128;
        Integer j = -128;
        System.out.println(String.format("i == j? %s", i == j));
        System.out.println(String.format("i != j? %s", i != j));


        Integer k = -129; // passou de -128 então == não funcionara quando tiver outro objeto do mesmo tipo com o mesmo valor
        Integer l = -129;
        System.out.println(String.format("k == l? %s", k == l));
        System.out.println(String.format("k != l? %s", k != l));


        int x = 1000; // o limite de -128 a 127 só funciona para tipos Wrappers com boxing
        int y = 1000;
        System.out.println(String.format("x == y? %s", x == y));
        System.out.println(String.format("x != y? %s", x != y));


        Integer t = new Integer(10); // o limite de -128 a 127 só funciona para tipos Wrappers com boxing( Integer x = 10)
        Integer p = new Integer(10);
        System.out.println(String.format("t == p? %s", t == p));
        System.out.println(String.format("t != p? %s", t != p));

    }
}