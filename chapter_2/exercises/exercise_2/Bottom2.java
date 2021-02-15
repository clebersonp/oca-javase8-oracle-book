/*
Compilar dentro do diretorio exercise_2: javac Bottom2.java
Executar dentro do diretorio exercise_2: java -cp ../ exercise_2.Bottom2
*/

package exercise_2;

class Top {
    public Top(String s) { System.out.print("B"); }
}

public class Bottom2 extends Top {
    public Bottom2(String s) { System.out.print("D"); }
    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }

    // Result: E.   -> Compilation fails
}