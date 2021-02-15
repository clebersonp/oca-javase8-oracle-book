/*
Compilar dentro do diretorio exercise_1: javac Test.java
Executar dentro do diretorio exercise_1: java -cp ../ exercise_1.Test
*/

package exercise_1;

public class Test {
    public static void main(String[] args) {
        // Given: public abstract interface Frobnicate { public void twiddle(String s); }
        // Which is a correct class? (Choose all that apply.)
    }

    // Result:
    // B.   -> public abstract class Frob implements Frobnicate {  }
    // E.   -> public class Frob implements Frobnicate {
    //  public void twiddle(String i) {  }
    //  public void twiddle(Integer s) {  }
    // }
}