/*
Compilar dentro do diretorio example_6: javac TestAnimal.java
*/


package example_6;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();

        Horse c = new Horse();

        // Não compila pois o compilador só vê o tipo da referencia que eh Animal
        // e o metodo eat() eh private: eat() has private access in Animal
        a.eat();

        // Não compila pois o compilador só vê o tipo da referencia que eh Animal
        // e o metodo eat() eh private: eat() has private access in Animal
        b.eat();
        c.eat();

        a.run();
        b.run();
        c.run();

        Animal.run();
        Horse.run();
    }
}

class Animal {
    private void eat() {
        System.out.println("Gerenic Animal Eating Generically ");
    }

    public static void run() {
        System.out.println("Gerenic Animal Running Generically ");
    }

    public final void climb() {
        System.out.println("Gerenic Animal Climbing Generically ");
    }
}

class Horse extends Animal {

    /*  
        Neste caso não é override ja que o subtipo não herda membros privates do supertipo, eh apenas um metodo novo com o mesmo nome
        Se tiver algum tipo da referencia polymorphism invocando esse metodo e for do tipo da superclass que tem o metodo private, não compila.
        O javac só olha o tipo da referencia, não olha para o tipo da instancia do objeto.
        Quem olha o tipo do objeto em é a JVM em runtime
        Só compila se o tipo da referencia e o objeto forem Horse.
    */
    public void eat() {
        System.out.println("Horse Eating .... ");
    }

    /*
        Não compila.
        Não é permitido overridden metodos marcados com static
        Mensagem: overridden method is static
    */
    public void run() {
        System.out.println("Horse Running .... ");
    }

    /*
        Não compila.
        Não é permitido overridden metodos marcados com modificador final
        Mensagem: overridden method is final
    */
    public void climb() {
        System.out.println("Horse Climbing .... ");
    }
}