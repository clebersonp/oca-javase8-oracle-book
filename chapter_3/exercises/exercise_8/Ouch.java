/*
    Compilar dentro do diretorio exercise_8: javac Ouch.java
    Executar dentro do diretorio exercise_8: java -cp ../ exercise_8.Ouch
*/

package exercise_8;

public class Ouch {
    static int ouch = 7;
    public static void main(String[] args) {
        new Ouch().go(ouch);
        System.out.print(" " + ouch);
    }
    void go(int ouch) {
        ouch++;
        for(int ouch = 3; ouch < 6; ouch++)
            ;
        System.out.print(" " + ouch);
    }

    // Result:. E-> Compilation fails
}