/*
Compilar dentro do diretorio legal: javac Foo.java
Executar dentro do diretorio legal: java -cp ../ legal.Foo
*/

package legal;

public class Foo {

    // Todos construtores legais
    Foo() {}
    private Foo(int x) {}
    Foo(byte b) {}
    Foo(int x, int... y) {}

    public static void main(String[] args) {
        Foo foo = new Foo(1, 2, 3, 4); // contrutor int x e int... y
        System.out.println(foo);
    }

}