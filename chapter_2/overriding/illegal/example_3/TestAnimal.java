/*
Compilar dentro do diretorio example_3: javac TestAnimal.java
*/


package example_3;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
    }
}

class Animal {
    public String eat() {
        return "Gerenic Animal Eating Generically";
    }
}

class Horse extends Animal {

    /*
        Não compila.
        Para compilar o retorno deve ser do mesmo tipo ou subtipo
        Mensagem: return type StringBuilder is not compatible with String
    */
    public StringBuilder eat() {
        new StringBuilder("Horse Eating ....");
    }
}