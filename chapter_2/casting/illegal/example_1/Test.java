/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class Animal { ; } // ; neste local não tem problema, o compilado dispreza

class Dog extends Animal { ; }

public class Test {
    public static void main(String[] args) {

        Animal a = new Animal();

        /*
            Compila, porem não executa, dá exception de cast.
            O compilador sabe que é possivel fazer downcast para o supertype, porem ao executar da erro
        */
        Dog d = (Dog) a;
        System.out.println("Downcast success!");
    }
}