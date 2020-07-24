/*
Compilar dentro do diretorio example_2: javac Test.java
*/

package example_2;

class Animal { ; } // ; neste local não tem problema, o compilador dispreza

class Dog extends Animal { ; }

public class Test {
    public static void main(String[] args) {

        Animal a = new Animal();

        /*
            Não compila pois não é possivel fazer downcast para um tipo diferente ou para um tipo que não eh supertype
            Erro de tipos incompativeis: incompatible types: Animal cannot be converted to String
        */
        String d = (String) a;
        System.out.println("Downcast success!");
    }
}