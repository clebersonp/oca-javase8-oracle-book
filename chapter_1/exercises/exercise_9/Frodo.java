/*
Compilar dentro do diretorio exercise_9: javac Frodo.java
Executar dentro do diretorio exercise_9: java -cp ../ exercise_9.Frodo
*/

package exercise_9;

public class Frodo extends Hobbit {
    public static void main(String[] args) {
        int myGold = 7;
        System.out.println(countGold(myGold, 6));
    }
    
    // Result:
    // D.    -> Compilation fails due to an erro on line 11
}
class Hobbit {
    int countGold(int x, int y) { return x + y; }
}