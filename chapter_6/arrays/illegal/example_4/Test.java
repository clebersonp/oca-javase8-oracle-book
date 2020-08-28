/*
Compilar dentro do diretorio example_4: javac Test.java
*/

package example_4;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        /*
            Referencias de objetos de array só podem receber referencias do mesmo tipo.
        */

        int[] splats;
        int[] dats = new int[4];
        char[] letters = new char[5];

        splats = dats;      // Ok, dats tambem referencia para o tipo de array de int
        splats = letters;   // NOK, não compila. letters referencia para um array de chars: Test.java:21: error: incompatible types: char[] cannot be converted to int[]



        Car[] cars;
        Honda[] cuteCars = new Honda[5];
        cars = cuteCars;        // Ok, diferente dos arrays de tipo primitivo, esse array aceita referencia Honda, pois Honda IS-A Car
        Beer[] beers = new Beer [99];
        cars = beers;           // NOK, pois Beers não eh um(IS-A) Car: Test.java:29: error: incompatible types: Beer[] cannot be converted to Car[]

        Car[] carsTwo = new Car[2];
        // Test.java:32: error: incompatible types: Car[] cannot be converted to Ferrari[]
        Ferrari[] ferraris = carsTwo;    // NOK, pois array de Car não necessariamente eh um array de Ferrari, pode ser um array de Honda. Ou seja, Car não eh uma(IS-A) Ferrari, mas ao contrario eh verdade

    }
}

class Car {}
class Honda extends Car {}
class Ferrari extends Car {}
class Beer {}