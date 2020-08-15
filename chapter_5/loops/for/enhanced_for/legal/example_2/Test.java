/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

class Animal { public String type(){ return "Animal"; } }

class Dog extends Animal { @Override public String type() { return "Dog"; } }

class Cat extends Animal { @Override public String type() { return "Cat"; } }

public class Test {
    public static void main(String[] args) {

        long [] la = { 7L, 8L, 9L};
        int [] [] twoDoe = { {1,2,3}, {4,5,6}, {7,8,9} };
        String [] sNums = { "one", "two", "three" };
        Animal [] animals = { new Animal(), new Dog(), new Cat() };
        List<Integer> numbers = Stream.of(10, 11, 12, 13, 14).collect(Collectors.toList());


        for (long y : la) System.out.println("y is " + y);

        for (int [] n : twoDoe) System.out.println("n is " + Arrays.toString(n));

        for (String sNum : sNums) System.out.println("sNum is " + sNum);

        for (Animal animal : animals) System.out.println("animal is " + animal.type());

        for (Integer number : numbers) System.out.println("number is " + number);

        // iterar com lambda expression
        numbers.forEach(System.out::println);
    }
}