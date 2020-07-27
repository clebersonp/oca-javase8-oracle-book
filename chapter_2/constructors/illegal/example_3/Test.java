/*
Compilar dentro do diretorio example_3: javac Test.java
*/

package example_3;

class Animal {
    Animal(String name) {}
}

class Horse extends Animal {
    Horse() {
        /*
            Não compila, pois na superclass não possui um construtor default, somente com argumento
            Msg: constructor Animal in class Animal cannot be applied to given types;
        */
        super();
    }
}

public class Test {
    public static void main(String[] args) {}
}