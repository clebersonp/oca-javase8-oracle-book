/*
    Compilar dentro do diretorio exercise_13: javac Dark.java
    Executar dentro do diretorio exercise_13: java -cp ../ exercise_13.Dark
*/

package exercise_13;

public class Dark {
    int x = 3;    
    public static void main(String[] args) {
        new Dark().go1();
    }
    void go1() {
        int x;
        go2(++x);
    }
    void go2(int y) {
        int x = ++y;
        System.out.println(x);
    }

    // Result:. E. -> Compilation fails
}