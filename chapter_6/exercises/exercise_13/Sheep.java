/*
Compilar dentro do diretorio exercise_13: javac Sheep.java
Executar dentro do diretorio exercise_13: java -cp ../ exercise_13.Sheep
*/

package exercise_13;

import java.util.function.Predicate;

public class Sheep {
    public static void main(String[] args) {
        Sheep s = new Sheep();
        s.go(() -> adder(5,1) < 7);   // line A
        s.go(x -> adder(6,2) < 9);    // line B
        s.go(x, y -> adder(3,2) < 4); // line C
    }
    // Result: Compilation fails na linha A e C

    void go(Predicate<Sheep> e) {
        Sheep s2 = new Sheep();
        if (e.test(s2))
            System.out.print("true ");
        else
            System.out.print("false ");
    }

    static int adder(int x, int y) {
        return x + y;
    }
}