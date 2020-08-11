/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;


/*
6 relationals operators usados no exam: <, <=(menor ou igual), >, >=(maior ou igual), ==(igual), !=(diferente)
Sempre resultam em um resultado boolean(true ou false);
*/

public class Test {
    public static void main(String[] args) {

        int x = 8;
        if (x < 9) {
            System.out.println(String.format("x(%s) < 9? %s", x, (x < 9)));
        }

        String name_1 = "jake";
        String name_2 = "Jake";
        System.out.println(String.format("%s == %s? %s", name_1, name_2, name_1 == name_2));
        System.out.println(String.format("%s != %s? %s", name_1, name_2, name_1 != name_2));

        int a = 10;
        int b = a;
        System.out.println(String.format("%s <= %s? %s", a, b, a <= b));
        System.out.println(String.format("%s >= %s? %s", a, b, a >= b));

        double d = 15.32;
        byte i = 15;
        System.out.println(String.format("%s > %s? %s", d, i, d > i));
    }
}