/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class Animal { ; } // ; neste local não tem problema, o compilador dispreza

class Dog extends Animal { ; }

public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();
        
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            System.out.println("Downcast success!");
        }
    }
}