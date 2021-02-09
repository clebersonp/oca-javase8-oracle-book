/*
Compilar dentro do diretorio exercise_16: javac TestPredicate.java
Executar dentro do diretorio exercise_16: java -cp ../ exercise_16.TestPredicate
*/

package exercise_16;

import java.util.function.*;

class MyClass {
    void test(Predicate<MyClass> e) {
        MyClass myClass = new MyClass();
        System.out.println(e.test(myClass));
    }
}

public class TestPredicate {
    public static void main(String[] args) {
        /*
            Given that adder() returns a int, which are valid Predicate lambdas? (Choose all that apply.)

            A. x, y -> 7 < 5
            B. x -> { return adder(2,1) > 5; }
            C. x -> return adder(2,1) > 5;
            D. x -> { int y = 5;
                      int z = 7;
                      adder(y,z) > 8; }
            E. x -> { int y = 5;
                      int z = 7;
                      return adder(y,z) > 8; }
            F. (MyClass x) -> 7 > 13
            G. (MyClass x) -> 5 + 4
        */

        MyClass myClass = new MyClass();
        myClass.test(x -> { return adder(2,1) > 5; }); // B

        myClass.test(x -> { int y = 5;
                      int z = 7;
                      return adder(y,z) > 8; }); // E

        myClass.test((MyClass x) -> 7 > 13); // F

    }

    static int adder(int x, int y) {
        return x + y;
    }

    // Result: B, E, F
}