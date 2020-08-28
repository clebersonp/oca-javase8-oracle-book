/*
Compilar dentro do diretorio example_7: javac Test.java
Executar dentro do diretorio example_7: java -cp ../ example_7.Test
*/

package example_7;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
            Array eh um objeto em java, independente se eh array de tipos primitivos ou não.
            A referencia do array aponta para um objeto na memória.

            Arrays são objetos que armazena variaveis do mesmo tipo;

            3 Passos para criar arrays:
            1 - Declarar;
            2 - Construir um objeto array
            3 - Inicializar os elementos do array

            Todo array criado tem seus elementos inicializados com valor default
            de primitivos e null para referencia de objetos

            Um array do tipo de objeto pode referenciar qualquer outro objeto que passe no teste IS-A, ou seja, que seja subclass
        */

        Car[] cars = new Car[] {new Car(), new Subaru(), new Ferrari()};

        for (Car car : cars) {
            if (car instanceof Subaru) {
                System.out.println("This car is a Subaru");
            } else if (car instanceof Ferrari) {
                System.out.println("This car is a Ferrari");
            } else if (car instanceof Car) {
                System.out.println("Is a genery car");
            }
        }
        


        Car[][] carsMulti = new Car[3][];
        Car[] simpleCars = new Car[2];
        Subaru subarus[] = new Subaru[2];
        Ferrari ferraris[] = new Ferrari[3];
        carsMulti[0] = simpleCars;   // Ok, mesma dimensão e Car IS-A Car
        carsMulti[1] = subarus;      // Ok, mesma dimensão e Subaru IS-A Car
        carsMulti[2] = ferraris;     // Ok, mesma dimensão e Ferrari IS-A Car

        for (Car[] oneDimen : carsMulti) {
            if (oneDimen instanceof Subaru[]) {
                System.out.println("This is a Subaru array");
            } else if (oneDimen instanceof Ferrari[]) {
                System.out.println("This is a Ferrari array");
            } else if (oneDimen instanceof Car[]) {
                System.out.println("Is a genery Car array");
            }
        }

    }
}

class Car { }
class Subaru extends Car { }
class Ferrari extends Car { }