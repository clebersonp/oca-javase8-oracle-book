/*
Compilar dentro do diretorio example_1: javac Test.java
*/

package example_1;

class Foo {
    int size;
    String name;

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
        
        /*
            NÃO COMPILA. Pois como já existe um construtor custom, eu preciso definir o construtor default
        */
        Foo f_1 = new Foo();
    }
}