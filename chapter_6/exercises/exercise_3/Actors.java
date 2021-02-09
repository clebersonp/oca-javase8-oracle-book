/*
Compilar dentro do diretorio exercise_3: javac Actors.java
Executar dentro do diretorio exercise_3: java -cp ../ exercise_3.Actors
*/

package exercise_3;

public class Actors {
    public static void main(String[] args) {
        char[] ca = {0x4e, \u004e, 78};
        System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));
    }
    // Result: Compilation fails. valor unicode deve estar entre ''
}