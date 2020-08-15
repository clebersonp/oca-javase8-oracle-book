/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.util.Arrays;

class Animal { public String type(){ return "Animal"; } }

class Dog extends Animal { @Override public String type() { return "Dog"; } }

class Cat extends Animal { @Override public String type() { return "Cat"; } }

public class Test {
    public static void main(String[] args) {

        int x;
        long x2;

        long [] la = { 7L, 8L, 9L};
        int [] [] twoDoe = { {1,2,3}, {4,5,6}, {7,8,9} };
        String [] sNums = { "one", "two", "three" };
        Animal [] animals = { new Animal(), new Dog(), new Cat() };

        for (x2 : la); // não compila pois a variavel x2 já foi declarada; Test.java:27: error: bad initializer for for-loop

        for (int x4 : twoDoe); // não pode converter um array(Object) em int; Test.java:29: error: incompatible types: int[] cannot be converted to int

        for (int x3 : la); // não pode converter implicitamente um long para int; Test.java:31: error: incompatible types: possible lossy conversion from long to int

        for (Dog animal : animals) Test.java:34: error: // o animal pode não ser um dog, ou seja, pode ser um cat ou animal; incompatible types: Animal cannot be converted to Dog
    }
}