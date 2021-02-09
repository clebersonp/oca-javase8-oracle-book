/*
Compilar dentro do diretorio exercise_11: javac Hedges.java
Executar dentro do diretorio exercise_11: java -cp ../ exercise_11.Hedges
*/

package exercise_11;

public class Hedges {
    public static void main(String[] args) {
        String s = "JAVA";
        s = s + "rocks";
        s = s.substring(4,8);
        s.toUpperCase();
        System.out.print(s);
    }
    // Result: rock
}