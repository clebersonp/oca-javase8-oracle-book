/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/


package example_1;

class A {

    // construtor sem arguments invoca o construtor com arguments passando o valor fixo "foo";
    // Recursividade;
    A() {
        this("foo");
    }

    // construtor com arguments invoca o construtor sem arguments;
    // Recursividade;
    A(String s) {
        this();
    }
}

public class Test {
    public static void main(String[] args) {

        /*
            NÃO COMPILA: recursive constructor invocation
            Nenhum dos construtores permite invocar o construtor de Object atraves de keyword super(),
            pois ambos construtores já usam a keyword this, e this e super no mesmo construtor não é permitido;
            The stacks explodes
            Se esse codigo rodasse, teria uma exception do tipo java.lang.StackOverflowError
        */
        A a = new A();
        System.out.println(a);
    }
}