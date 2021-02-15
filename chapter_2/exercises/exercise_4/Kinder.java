/*
Compilar dentro do diretorio exercise_4: javac Kinder.java
Executar dentro do diretorio exercise_4: java -cp ../ exercise_4.Kinder
*/

package exercise_4;

class AgedP {
    AgedP() {  }
    public AgedP (int x) {

    }
}

public class Kinder extends AgedP {
    
    public Kinder(int x) {
        super();
    }

    public static void main(String[] args) {
        new Kinder(2);
        System.out.println("Done");
    }

    // Result: A.   -> Kinder
}