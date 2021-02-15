/*
Compilar dentro do diretorio exercise_15: javac MultiInt.java
Executar dentro do diretorio exercise_15: java -cp ../ exercise_15.MultiInt
*/

package exercise_15;

interface I1 {
    default int doStuff() { return 1; }
}

interface I2 {
    default int doStuff() { return 2; }
}
public class MultiInt implements I1, I2 {
    public static void main(String[] args) {
        new MultiInt().go();
    }
    void go () {
        System.out.println(doStuff());
    }
    int doStuff() {
        return 3;
    }

    // Result: E.    -> Compilation fails
}