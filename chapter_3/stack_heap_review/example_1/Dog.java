/*
Compilar dentro do diretorio example_1: javac Dog.java
Executar dentro do diretorio example_1: java -Xms16m -Xmx56m -cp ../ example_1.Dog

*/

package example_1;

import java.io.IOException;

class Collar {}

/*
    Instace variable and objects live on the heap (Where Garbage Collection(GC) removes unused objets);
    Local variable lives on the stack;
*/

public class Dog {
    Collar c;                                                   // instace variable
    String name;                                                // instace variable

    public static void main(String[] args) throws IOException { // is placed on the stack

        // reference variable d is created on the stack, but can point to an object that lives on the heap
        Dog d;                                                  // local variable: d
        d = new Dog();
        d.go(d); // a copy of the reference variable d is passed to the go() method(copia do ponteiro)

        System.out.println(d.name);

        /* Toda aplicação java possui a SingleInstance de Runtime e permite aplicações
         se comunicar com o ambiente (OS) que a aplicação está executando.
        */
        Runtime rt = Runtime.getRuntime();

        System.out.println(String.format("Available Processors: %d", rt.availableProcessors()));
        System.out.println(String.format("Total Memory: %d MB", rt.totalMemory() / 1024 / 1024));
        System.out.println(String.format("Free Memory: %d MB", rt.freeMemory() / 1024 / 1024));
        System.out.println(String.format("Max Memory: %d MB", rt.maxMemory() / 1024 / 1024));

        String command = String.format("gedit %s", Dog.class.getResource("example.txt").getPath());
        System.out.println(String.format("Command that will run in terminal: %s", command));
        rt.exec(command);
    }

    void go(Dog dog) {                                          // local variable: dog

        // Novo objeto Collar criado no heap e assinado a instace variable c de Dog;
        c = new Collar();
        dog.setName("Aiko");
    }

    // adiciona o metodo a stack com o parametro dogName como local variable
    void setName(String dogName) {                              // local variable: dogName
        name = dogName;
        // remove da stack apos finalizar o metodo e remove todas local variables;
    }
}