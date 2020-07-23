/*
Compilar dentro do diretorio example_5: javac TestAnimal.java
*/


package example_5;

import java.util.Objects;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
    }
}

class Animal {
    public void eat(String value) {
        System.out.println("Gerenic Animal Eating Generically " + value);
    }
}

class Horse extends Animal {

    /*
        Não compila.
        Para compilar o metodo override não deve lançar novas exceptions checadas
        pois o metodo na classe pai não lança exception
        ou a exception no metodo override deve ser de qualquer tipo de runtime
        Mensagem: overridden method does not throw Exception
    */
    public void eat(String value) throws Exception {
        if (Objects.isNull(value)) {
            throw new Exception();
        }
        System.out.println("Horse Eating .... " + value);
    }
}