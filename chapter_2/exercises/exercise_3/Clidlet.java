/*
Compilar dentro do diretorio exercise_3: javac Clidlet.java
Executar dentro do diretorio exercise_3: java -cp ../ exercise_3.Clidlet
*/

package exercise_3;

class Clidder {
    private final void flipper() { System.out.println("Clidder"); }
}

public class Clidlet extends Clidder {
    public final void flipper() { System.out.println("Clidlet"); }
    public static void main(String[] args) {
        new Clidlet().flipper();
    }

    // Result: A.   -> Clidlet
}