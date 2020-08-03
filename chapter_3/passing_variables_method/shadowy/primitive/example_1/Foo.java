/*
Compilar dentro do diretorio example_1: javac Foo.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Foo
*/


package example_1;

public class Foo {

    static int size = 7;

    // passando a copia(bits) da variavel primitiva para o metodo changeIt
    static void changeIt(int size) {

        // shadowy, não será alterado o valor da variavel static pois não está referencia a ela,
        // a alteracao so refletira na propria variavel local
        // para variaveis de instancia deve-se usar this. quando o nome da variavel do metodo e igual ao nome da variavel de instancia
        // para variaveis de class ou static deve-se usar o nome da classe Foo.size
        size = size + 200;
        System.out.println(String.format("size in changeIt() is '%s'", size));
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.println(String.format("size = '%s'", size));
        
        // passando a copia(bits) da variavel primitiva static size para o metodo changeIt
        changeIt(size);
        System.out.println(String.format("size after changeIt() is '%s'", size));
    }
}