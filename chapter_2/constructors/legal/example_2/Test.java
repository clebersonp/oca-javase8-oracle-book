/*
Compilar dentro do diretorio example_2: javac Test.java
Compilar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

class Foo {
    int size;
    String name;

    /*
        Construtor default
    */
    Foo() {}

    /*
        Construtor com argumentos. Neste caso o compilador não cria um construtor default,
        se eu precisar de um eu preciso codificar manualmente
    */
    Foo(String name, int size) {
        this.name = name;
        this.size = size;
    }
}

public class Test {
    public static void main(String[] args) {
        
        Foo f_1 = new Foo();
        Foo f_2 = new Foo("Foo", 10);

        System.out.println("Compila e executa sem erros");
    }
}