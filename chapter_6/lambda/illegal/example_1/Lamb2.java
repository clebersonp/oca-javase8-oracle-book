/*
Compilar dentro do diretorio example_1: javac Lamb2.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Lamb2
*/

package example_1;

import java.util.function.Predicate;

public class Lamb2 {
    public static void main(String[] args) {
        Lamb2 m1 = new Lamb2();

        // ================== LEGAL LAMBDAS ==========================
        m1.go(x -> 7 < 5);
        m1.go(x -> { return adder(2, 1) > 5; });
        m1.go((Lamb2 x) -> { int y = 5;
                                return adder(y, 7) > 8; });

        m1.go(x -> { int y = 5; return adder(y, 6) > 8; });
        int a = 5; int b = 6;
        m1.go(x -> { return adder(a, b) > 8; });
        m1.go((Lamb2 x) -> adder(a, b) > 13);



        // ================== ILLEGAL LAMBDAS ==========================
        // m1.go(x -> return adder(2, 1) > 5; );
        // m1.go(Lamb2 x -> adder(2, 3) > 7);
        // m1.go(() -> adder(2, 3) > 7);
        // m1.go(x -> { adder(4, 2) > 9 });
        // m1.go(x -> { int y = 5; adder(y, 7) > 8; });
    }

    void go(Predicate<Lamb2> e) {
        Lamb2 m2 = new Lamb2();
        System.out.println(e.test(m2) ? "ternary true" : "ternary false");
    }

    static int adder(int x, int y) { return x + y; }
}