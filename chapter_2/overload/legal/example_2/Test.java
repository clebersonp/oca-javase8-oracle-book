package example_2;

class Animal {}

class Horse extends Animal {}

public class Test {

    // overload method, lista de argumentos diferente e o metodo não é da superclass
    public void doStuff(Animal a) {
        System.out.println("In the Animal version of overload method");
    }

    // overload de method, lista de argumentos diferente e o metodo não é da superclass
    public void doStuff(Horse h) {
        System.out.println("In the Horse version of overload method");
    }

    public static void main(String[] args) {

        Test t = new Test();
        Animal animalObj = new Animal();
        Horse horseObj = new Horse();
        Animal animalRefToHorse = new Horse();

        t.doStuff(animalObj);
        t.doStuff(horseObj);
        t.doStuff(animalRefToHorse);

        /*
            Em metodos overload(em tempo de compilação), o compilador olha o tipo da referença;
            Em metodos override(em tempo de execução), a JVM olha o tipo da instancia(Objeto);
        */
    }
}