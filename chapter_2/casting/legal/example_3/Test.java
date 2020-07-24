/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

class Animal { ; } // ; neste local não tem problema, o compilador dispreza

class Dog extends Animal {

    public void doStuff() {
        System.out.println("Dog doing stuff's dog!");
    }

}

public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();

        if (a instanceof Dog) {
            // downcast e invoca metodo diretamente, precisa envolver por () o cast,
            // caso contrário da erro de compilação pois não conhece como um statement valido
            ((Dog) a).doStuff();
        }

    }
}