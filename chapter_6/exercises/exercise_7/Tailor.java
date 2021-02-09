/*
Compilar dentro do diretorio exercise_7: javac Tailor.java
Executar dentro do diretorio exercise_7: java -cp ../ exercise_7.Tailor
*/

package exercise_7;

public class Tailor {
    public static void main(String[] args) {
        byte[][] ba = {{1,2,3,4}, {1,2,3}};
        System.out.println(ba[1].length + " " + ba.length);
    }
    // Result: 3 2
}