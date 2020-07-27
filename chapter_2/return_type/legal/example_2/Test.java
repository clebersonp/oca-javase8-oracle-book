/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

class Animal {}

class Horse extends Animal {}

interface Chewable{}

class Gum implements Chewable {}

public class Test {
    public static void main(String[] args) {

        Test t = new Test();
        t.getChewable();
        t.getHorseAnimal();
        t.getObject();

        System.out.println("Finalizado com sucesso");
    }

    /*
        Retorna uma instance de Gum a partir do cast implicito
    */
    public Chewable getChewable() {
        return new Gum(); // Gum IS-A Chewable, it's OK
    }

    /*
        Retorna uma instance de Horse a partir do cast implicito
    */
    public Animal getHorseAnimal() {
        return new Horse(); // Horse IS-A Animal, it's OK
    }

    /*
        Retorna um array de int, o qual array tbm é um objeto
    */
    public Object getObject() {
        int[] nums = {1, 2, 3};
        return nums; // int Array IS-A Object, it's OK
    }
}