/*
Compilar dentro do diretorio example_1: javac TestAnimal.java
*/


package example_1;

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
        Não é permitido overriding um método e diminuir o nivel do modificador de acesso.
        Só é permitido deixa-lo menos restritivo
        Mensagem: attempting to assign weaker access privileges; was public
    */
    @Override
    private void eat() {
        System.out.println("Horse Eating...");
    }
}