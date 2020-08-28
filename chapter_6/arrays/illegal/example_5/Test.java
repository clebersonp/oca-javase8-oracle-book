/*
Compilar dentro do diretorio example_5: javac Test.java
*/

package example_5;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        /*
            Referencias de objetos de array de multidimensão só podem receber referencias do mesmo tipo e mesma dimensão.
        */

        int[] blots;
        int[] blocks = new int[6];
        blots = blocks;             // OK, mesmo tipo e mesma dimensao

        int[] squeegees [] = new int[3][];
        blots = squeegees;          // NOK, dimensoes diferentes: Test.java:21: error: incompatible types: int[][] cannot be converted to int[]



        int[][] books = new int[3][];
        int[] numbers = new int[6];
        char[] letters = new char[3];
        int aNumber = 7;
        books[0] = numbers;     // OK, mesma dimensao
        books[1] = aNumber;     // NOK, dimensoes diferentes: Test.java:29: error: incompatible types: int cannot be converted to int[]
        books[2] = letters;     // NOK, mesma dimensao mas tipo diferente: Test.java:31: error: incompatible types: char[] cannot be converted to int[]

        Car[][] cars = new Car[3][];
        Car[] simpleCars = new Car[2];
        Subaru subarus[] = new Subaru[2];
        Ferrari ferraris[] = new Ferrari[3];
        cars[0] = simpleCars;   // Ok, mesma dimensão e Car IS-A Car
        cars[1] = subarus;      // Ok, mesma dimensão e Subaru IS-A Car
        cars[2] = ferraris;     // Ok, mesma dimensão e Ferrari IS-A Car

    }
}

class Car {}
class Subaru extends Car {}
class Ferrari extends Car {}