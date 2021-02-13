/*
    Compilar dentro do diretorio exercise_6: javac Mirror.java
    Executar dentro do diretorio exercise_6: java -cp ../ exercise_6.Mirror
*/

package exercise_6;

public class Mirror {
    int size = 7;
    public static void main(String[] args) {
        Mirror m1 = new Mirror();
        Mirror m2 = m1;
        int i1 = 10;
        int i2 = i1;
        go(m2, i2);
        System.out.println(m1.size + " " + i1);
    }
    static void go(Mirror m, int i) {
        m.size = 8;
        i = 12;
    }
    // What is the result?

    // Result: B. -> 8 10
}