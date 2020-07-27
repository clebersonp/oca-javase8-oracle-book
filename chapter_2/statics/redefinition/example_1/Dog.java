/*
Compilar dentro do diretorio example_1: javac Dog.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Dog
*/

package example_1;

class Animal {
    static void doStuff() {
        System.out.print("a ");
    }
}

public class Dog extends Animal {
    
    /*
        Metodo static não pode ser override, somente redefinido
    */
    static void doStuff() {
        System.out.print("d ");
    }

    public static void main(String[] args) {
        Animal [] a = { new Animal(), new Dog(), new Animal() };

        for (int x = 0; x < a.length; x++) {

            /*
                Invocando usando o tipo da referencia;
                Como metodo static não pode ser override, então será invocado o metodo do tipo da referencia,
                no caso como o array eh de Animal, todas as chamadas serão feitas como se fosse Animal.doStuff();
            */
            a[x].doStuff();
        }

        Dog.doStuff(); // modo correto, invocando usando nome da class
    }
}