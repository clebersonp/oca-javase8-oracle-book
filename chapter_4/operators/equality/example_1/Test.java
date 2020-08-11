/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

/*
O que pode ser testado com operadores de igualdade:
Numbers;
Characters:
Boolean primitives;
Object reference variables;
*/

public class Test {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        int c = 11;
        System.out.println(String.format("int %s == int %s? %s", a, b, a == b));
        System.out.println(String.format("int %s != int %s? %s", a, c, a != c));

        char d = 'd';
        char e = d;
        char f = 'f';
        System.out.println(String.format("char %s == char %s? %s", d, e, d == e));
        System.out.println(String.format("char %s != char %s? %s", e, f, e != f));

        boolean g = true;
        boolean h = g;
        boolean i = false;
        System.out.println(String.format("boolean %s == boolean %s? %s", g, h, g == h));
        System.out.println(String.format("boolean %s != boolean %s? %s", h, i, h != i));

        Test j = new Test();
        Test k = j;
        Test l = new Test();
        // valor da variavel de referencia, como chegar ao objeto na heap
        System.out.println(String.format("reference %s == reference %s? %s", j, k, j == k));
        System.out.println(String.format("reference %s != reference %s? %s", k, l, k != l));
    }
}