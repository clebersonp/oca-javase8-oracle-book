/*
Compilar dentro do diretorio example_8: javac Test.java
*/


package example_8;

class Animal {
    public void doStuff(Animal a) {
        System.out.println("In the Animal version of method");
    }
}

class Horse extends Animal {
    
    @Override // não compila. override de method DEVE ter a lista de argumentos e tipos exatamente igual ao da superclass, não aceita nem subtypes
    public void doStuff(Horse a) {
        System.out.println("In the Horse version of override method");
    }
}

public class Test {

    public static void main(String[] args) {

        Animal animalObj = new Animal();
        Horse horseObj = new Horse();
        Animal animalRefToHorse = new Horse();

        animalObj.doStuff(animalObj);
        horseObj.doStuff(horseObj);
        animalRefToHorse.doStuff(animalRefToHorse);

        /*
            Em metodos overload(em tempo de compilação), o compilador olha o tipo da referença;
            Em metodos override(em tempo de execução), a JVM olha o tipo da instancia(Objeto);
            Polymorphism é utilizado em overrided methods
        */
    }
}