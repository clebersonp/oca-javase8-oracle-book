/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

class Animal {
    public void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
}

class Horse extends Animal {
    
    // polymorphism só se dá atraves de override methods da superclass
    @Override
    public void eat() {
        System.out.println("Horse eating hay ..");
    }
    
    // overload pois tem a lista de argumentos diferente
    public void eat(String s) {
        System.out.println("Horse eating .. " + s);
    }
}

public class Test {
    public static void main(String[] args) {

        Animal a = new Animal();
        Horse h = new Horse();
        Animal ah = new Horse();

        // metodo override a JVM executa o tipo do objeto
        a.eat();
        h.eat();
        ah.eat();

        // executando overload method, o compilador olha o tipo da referença
        h.eat("Apple");

        // essas duas chamadas não compila
        // como esse metodo é overload, o compilador só olha o tipo da referença e, portanto, não possui esse metodo na class Animal
        // a.eat("treats");
        // ah.eat("Carrots");

    }
}