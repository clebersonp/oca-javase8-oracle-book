/*
Compilar dentro do diretorio exercise_7: javac Locomotive.java
Executar dentro do diretorio exercise_7: java -cp ../ exercise_7.Locomotive
*/

package exercise_7;

public class Locomotive {
    Locomotive() {  main("hi"); }
    public static void main(String[] args) {
        System.out.print("2 ");
        // new Locomotive();
    }
    public static void main(String args) {
        System.out.print("3 " + args);
    }

    // Result: A.   -> 2
}