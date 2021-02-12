/*
Compilar dentro do diretorio exercise_4: javac Feline.java 
Executar dentro do diretorio exercise_4: java -cp ../ exercise_4.Feline
*/

package exercise_4;

public class Feline {
    public static void main(String[] args) {
        long x = 42L;
        long y = 44L;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(foo() + x + 5 + " ");
        System.out.println(x + y + foo());
    }
    static String foo() { return "foo"; }
    
    // Result: G. -> 72 foo425 86foo
}