/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class Alpha {

    char c;

    Alpha() {}
    Alpha(char c) {
        this.c = c;
    }

    Alpha doStuff(char c) {
        System.out.println("Accessing doStuff of Alpha instance ...");
        return new Alpha(c);
    }
}

class Beta extends Alpha {

    Beta() {}
    Beta(char c) {
        super(c);
    }

    /*
        Override: pode mudar o tipo do return desde que seja subtype da superclass, ou seja, Beta IS-A Alpha(instanceOf)
    */
    @Override
    Beta doStuff(char c) {
        System.out.println("Accessing doStuff of Beta instance ...");
        return new Beta(c);
    }

    @Override
    public String toString() {
        return "[ c: " + this.c + " ]";
    }
}

public class Test {
    public static void main(String[] args) {
        Alpha a = new Beta();

        // em tempo de compilação só olha o tipo da referencia, por isso precisou do cast explicito
        // acessando method override(subclass) em tempo de runtime
        Beta b = (Beta) a.doStuff('B');

        System.out.println(b);
    }
}