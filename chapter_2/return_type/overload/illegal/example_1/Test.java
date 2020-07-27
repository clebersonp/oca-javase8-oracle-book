/*
Compilar dentro do diretorio example_1: javac Test.java
*/

package example_1;

class Foo {
    void go() {}
}

class Bar extends Foo {
    
    /*
        NÃO COMPILA.
        Overloading: DEVE mudar a lista de argumentos para o reuso do nome do método.
        Não pode mudar somente o tipo do retorno, pois o compilador vai achar que tentou fazer um override
        Msg: go() in Bar cannot override go() in Foo
    */
    String go() {
        return String.valueOf(10);
    }
}

public class Test {
    public static void main(String[] args) {
        Bar bar = new Bar();
        System.out.println(String.format("Bar value is '%s'", bar.go()));
    }
}