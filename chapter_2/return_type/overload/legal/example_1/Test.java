/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class Foo {
    void go() {}
}

class Bar extends Foo {
    
    /*
        Overloading: DEVE mudar a lista de argumentos e o retorno pode ser tipo diferente
    */
    String go(int x) {
        return String.valueOf(x);
    }
}

public class Test {
    public static void main(String[] args) {
        Bar bar = new Bar();
        System.out.println(String.format("Bar value is '%s'", bar.go(10)));
    }
}