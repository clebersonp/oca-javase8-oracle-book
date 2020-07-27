/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.util.Arrays;
import java.util.List;

class Button {}

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.doStuff();
        System.out.println(Arrays.asList(t.go()));
        System.out.println(t.foo());
        System.out.println(t.bar());
        t.nothing();
    }

    /*
        Retornos do tipo de reference de objeto pode retornar o valor null
    */
    public Button doStuff() {
        System.out.println("Return null value from return method object reference is legal");
        return null;
    }

    /*
        Pode retornar array
    */
    public String[] go() {
        return new String[] {"Fred", "Barney", "Wilma"};
    }

    /*
        No return type pode retornar tipos compativeis com cast implicito
    */
    public int foo() {
        char c = 'c';
        return c; // char eh compativel com int
    }

    /*
        No return type pode retornar tipos compativeis com cast explicito
    */
    public int bar() {
        float f = 32.5f;
        return (int) f; // cast explicito para int
    }

    /*
        Method void não deve retornar valor,
        mas pode utilizar somente a keyword return quando desejar retornar imediatamente;
    */
    public void nothing() {
        System.out.println("Do nothing");
        return;
    }
}