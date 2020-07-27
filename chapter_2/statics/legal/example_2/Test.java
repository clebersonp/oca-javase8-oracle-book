/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

class Frog {
    private static int frogCount = 0;
    static int getCount() {
        return frogCount;
    }
    public Frog() {
        frogCount += 1;
    }
}

public class Test {
    public static void main(String[] args) {
        new Frog();
        new Frog();
        new Frog();
        // invocando da forma correta, ou seja, da forma static
        System.out.println("from static " + Frog.getCount());
        new Frog();
    
        new Test().go();

        Frog f = new Frog();
        // acessando atraves de uma variavel de referencia, não dá exception de null pointer pois não usa a instancia e sim o type;
        System.out.println("user ref var " + f.getCount());

        Frog frogNull = null;
        // acessando atraves de uma variavel de referencia, não dá exception de null pointer pois não usa a instancia e sim o type da variavel de referencia;
        // esse truque só funciona para classes, interface com metodos ou variaveis statics somente usando o type(nome da interface)
        System.out.println("user ref null var " + frogNull.getCount());
    }
    void go() {
        // invocando da forma correta, ou seja, da forma static
        System.out.println("from inst " + Frog.getCount());
    }
}