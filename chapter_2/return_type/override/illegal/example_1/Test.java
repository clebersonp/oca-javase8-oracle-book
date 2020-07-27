/*
Compilar dentro do diretorio example_1: javac Test.java
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
        Neste caso não compila pois são tipos de return incompativeis;
        Msg: return type char is not compatible with Alph
    */
    @Override
    char doStuff(char c) {
        System.out.println("Accessing doStuff of Beta instance ...");
        return c;
    }

    @Override
    public String toString() {
        return "[ c: " + this.c + " ]";
    }
}

public class Test {
    public static void main(String[] args) {
        Alpha a = new Beta();

        // em tempo de compilação só olha o tipo da referencia
        // acessando method override(subclass) em tempo de runtime
        // NÃO COMPILA. Msg: return type char is not compatible with Alph
        char c = (char) a.doStuff('B');

        System.out.println(c);
    }
}