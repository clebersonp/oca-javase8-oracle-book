/*
Compilar dentro do diretorio example_1: javac TestDogs.java
Executar dentro do diretorio example_1: java - cp ../ example_1.TestDogs
*/

package example_1;

import java.util.*;
import java.util.function.*;

public class TestDogs {
    public static void main(String [] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("boi", 30, 6));        dogs.add(new Dog("tyri", 40, 12));
        dogs.add(new Dog("charis", 120, 7));    dogs.add(new Dog("aiko", 50, 10));
        dogs.add(new Dog("clover", 35, 12));    dogs.add(new Dog("mia", 15, 4));
        dogs.add(new Dog("zooey", 45, 8));

        System.out.println("all dogs " + dogs);
        System.out.println("min age 7 " + minAge(dogs, 7).toString());
        System.out.println("max wght. " + maxWeight(dogs, 40).toString());

        System.out.println("max age 10 using lambda expression: " + doQuerier(dogs, d -> d.getAge() <= 10).toString());
        System.out.println("min wght 60 using lambda expression: " + doQuerier(dogs, (Dog d) -> d.getWeight() >= 60).toString());
        System.out.println("age = 12 using lambda expression: " + doQuerier(dogs, (Dog d) -> { return d.getAge() == 12; }).toString());
        System.out.println("weight = 120 using lambda expression: " + doQuerier(dogs, d -> { return d.getAge() == 12; }).toString());
    }

    static List<Dog> minAge(List<Dog> dogList, int testFor) {
        List<Dog> result1 = new ArrayList<>();
        for(Dog d : dogList)
            if (d.getAge() >= testFor)
                result1.add(d);
        return result1;
    }

    static List<Dog> maxWeight(List<Dog> dogList, int testFor) {
        List<Dog> result1 = new ArrayList<>();
        for(Dog d : dogList)
            if (d.getWeight() <= testFor)
                result1.add(d);
        return result1;
    }

    /*
        Sintaxe basica para o lambda Predicate:
        ---------------------------------------------------------------------------
        | A single parameter      |       An arrow-token      |       A body      |
        |-------------------------|---------------------------|-------------------|
        |         x               |           ->              |       7 != 5      |
        ---------------------------------------------------------------------------

        - O parametro pode ser somente o nome da variavel, ou pode ser o tipo seguido pelo nome da variavel tudo em parenteses;
        - O body DEVE(de uma forma ou outra) retornar um boolean;
        - O body pode ser uma simples expressão boolean, a qual não pode ter a instrução return;
        - O body pode ser um bloco de codigo cercado por {}, contendo uma ou mais instruções validas, cada uma com um ;(ponto e virgula) e o bloco deve terminar com a instrução return;
    */

    static List<Dog> doQuerier(List<Dog> dogList, Predicate<Dog> expr) { // passando codigo como argumento(lambda expression)
        List<Dog> result1 = new ArrayList<>();
        for(Dog d : dogList)
            if (expr.test(d))
                result1.add(d);
        return result1;
    }
}

class Dog {
    String name;
    int weight;
    int age;

    Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    String getName() { return this.name; }
    int getWeight() { return this.weight; }
    int getAge() { return this.age; }

    public String toString() {
        return name;
    }
}