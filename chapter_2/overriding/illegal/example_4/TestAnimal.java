/*
Compilar dentro do diretorio example_4: javac TestAnimal.java
*/


package example_4;

import java.util.Objects;
import javax.print.PrintException;
import javax.naming.NamingException;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
    }
}

class Animal {
    public void eat(String value) throws PrintException  {
        if (Objects.isNull(value)) {
            throw new PrintException();
        }
        System.out.println("Gerenic Animal Eating Generically");
    }
}

class Horse extends Animal {

    /*
        Não compila.
        Para compilar o metodo override deve lançar a exception do mesmo tipo da exception da classe pai
        ou a exception deve ser subtipo ou nenhuma ou qualquer tipo de runtime
        Mensagem: overridden method does not throw NamingException
    */
    public void eat(String value) throws NamingException {
        if (Objects.isNull(value)) {
            throw new NamingException();
        }
        System.out.println("Horse Eating ....");
    }
}