/*
Compilar dentro do diretorio example_2: javac TestAnimal.java
*/


package example_2;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
    }
}

class Animal {
    public void eat() {
        System.out.println("Gerenic Animal Eating Generically");
    }
}

class Horse extends Animal {

    /*
        Não compila.
        Não existe o metodo com o mesmo nome a quantidade de argumentos na superclass
        Para compilar precisa ter a mesma assinatura do metodo da superclass, ou seja,
        mesmo retorno(ou subtype), mesmo nome, mesma lista de argumentos 
        Mensagem: method does not override or implement a method from a supertype
    */
    @Override
    public void eat(String value) {
        System.out.println("Horse Eating some " + value);
    }
}