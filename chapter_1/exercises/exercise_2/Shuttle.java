/*
Compilar dentro do diretorio exercise_2: javac Shuttle.java
Executar dentro do diretorio exercise_2: java -cp ../ exercise_2.Shuttle
*/

package exercise_2;

class Rocket {
    private void blastOff() { System.out.print("bang "); }
}
public class Shuttle extends Rocket {
    public static void main(String[] args) {
       new Shuttle().go();
    }
    void go() {
        blastOff();
        // Rocket.blastOff();   // line A
    }
    private void blastOff() { System.out.print("sh-bang "); }
    // Result:
    // B.    -> As the code stands, the output is sh-bang
    // F.    -> If line A is uncommented, compilation fails.
}