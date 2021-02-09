/*
Compilar dentro do diretorio exercise_1: javac Mutant.java
Executar dentro do diretorio exercise_1: java -cp ../ exercise_1.Mutant
*/

package exercise_1;

public class Mutant {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        String s = "abc";
        sb.reverse().append("d");
        s.toUpperCase().concat("d");
        System.out.println("." + sb + ". ." + s + ".");

        // Result: .cbad. .abc.
    }
}