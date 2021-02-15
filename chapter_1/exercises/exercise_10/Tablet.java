/*
Compilar dentro do diretorio exercise_10: javac Tablet.java
Executar dentro do diretorio exercise_10: java -cp ../ exercise_10.Tablet
*/

package exercise_10;

interface Gadget {
    void doStuff();
}
abstract class Electronic {
    void getPower() { System.out.print("plug in "); }
}
public class Tablet extends Electronic implements Gadget {
    void doStuff() { System.out.print("show book "); }
    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
    
    // Result:
    // A.    -> The class Tablet will NOT compile
}