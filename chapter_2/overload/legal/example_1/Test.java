/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/


package example_1;

import java.io.IOException;

class Foo {
    public void doStuff(int y, String s) {
        System.out.println(String.format("Doing stuffs from %s with arguments '%s' and '%s'", Foo.class.getSimpleName(), y, s));
    }
    public void moreThings(int x) {}
}

class Bar extends Foo {

    // não é overriden e sim overload pois a lista de argumentos mudou, então pode lançar novas exceptions
    // O que decide qual metodo overload será executado é baseado na lista de argumentos
    public void doStuff(int y, long s) throws IOException {
        System.out.println(String.format("Doing stuffs from %s with arguments '%s' and '%s'", Bar.class.getSimpleName(), y, s));
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        Bar b = new Bar();
        b.doStuff(10, 15L);
        b.doStuff(5, "Hello World");
    }
}