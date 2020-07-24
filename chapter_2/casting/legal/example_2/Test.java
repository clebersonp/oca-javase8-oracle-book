/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

class Animal { ; } // ; neste local não tem problema, o compilador dispreza

class Dog extends Animal { ; }

public class Test {
    public static void main(String[] args) {

        Dog d = new Dog();
        Animal a1 = d; // upCasting pode ser implicito, pois os metodos ficam restritos ao supertype
        Animal a2 = (Animal) d; // upCasting pode ser explicito, mas não é obrigatório

        System.out.println("Casting success!");
    }
}