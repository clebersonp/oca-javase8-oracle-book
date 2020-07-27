/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class Frog {

    /*
        Variavel static pertence a class, e é criada quando a class é carregada pela JVM
        Chamada tambem de variavel de class, é compartilhada por todas as instancias pois pertence a class;
    */
    static int frogCount = 0;

    public Frog() {
        frogCount += 1;
    }
}

public class Test {
    public static void main(String[] args) {
        new Frog();
        new Frog();
        new Frog();
        new Frog();
        System.out.println(String.format("Frog count is now %d", Frog.frogCount));
    }
}