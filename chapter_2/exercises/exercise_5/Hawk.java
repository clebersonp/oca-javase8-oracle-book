/*
Compilar dentro do diretorio exercise_5: javac Hawk.java
Executar dentro do diretorio exercise_5: java -cp ../ exercise_5.Hawk
*/

package exercise_5;

class Bird {
    static { System.out.print("a1 "); }
    { System.out.print("b1 "); }
    public Bird() { System.out.print("b2 "); }
}
class Raptor extends Bird {
    static { System.out.print("r1 "); }
    public Raptor() { System.out.print("r2 "); }
    { System.out.print("r3 "); }
    static { System.out.print("r4 "); }
}
class Hawk extends Raptor {
    public static void main(String[] args) {

        /* ao carregar a class Hawk na JVM,
            serão executados todos os blocs statics somente um vez,
            da superclass para subclass, top down dentro das classes
        */

        System.out.print("pre ");
        new Hawk();
        System.out.println("hawk ");
    }
}