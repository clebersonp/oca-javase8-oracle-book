/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

interface Skippable {
    default void skipper() {
        System.out.println(String.format("Skipping from %s", Skippable.class.getSimpleName()));
    }
}

class Animal {
    public void eat() {}
    public void printYourself() {
        System.out.println(String.format("Invoking super class. Printing %s", Animal.class.getSimpleName()));
    }
}

class Horse extends Animal implements Skippable {
    
    @Override
    public void printYourself() {
        System.out.println(String.format("Printing %s", Horse.class.getSimpleName()));
        super.printYourself(); // invocando o metodo do supertype ou super class
    }

    @Override
    public void skipper() {
        System.out.println(String.format("Skipping from %s", Horse.class.getSimpleName()));

        // Invocando um metodo da interface com super. Quando interface, precisa usar o nome da interface antes da palavra super
        Skippable.super.skipper();
    }
}

public class Test {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.printYourself();
        h.skipper();
    }
}