/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class Foo {
    public void doFooStuff() { System.out.println("Do Foo Stuffs"); }
}

class Bar extends Foo {
    public void doBarStuff() { System.out.println("Do Bar Stuffs"); }
}

public class Test {
    public static void main(String[] args) {

        /*
            Criar variavel de referencia chamada reallyABar do tipo Foo;
            Criar novo objeto Bar na memoria Heap;
            Atribuir o novo objeto criado(ponteiro da memoria heap) para a variavel de referencia reallyABar
        */
        Foo reallyABar = new Bar(); // legal pq Bar IS-A  subclass Foo

        reallyABar.doFooStuff();

        // Bar reallyAFoo = new Foo(); // não compila Foo não é subclass de Bar
    }
}