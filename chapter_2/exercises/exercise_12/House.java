/*
Compilar dentro do diretorio exercise_12: javac House.java
Executar dentro do diretorio exercise_12: java -cp ../ exercise_12.House
*/

package exercise_12;

class Building {
    Building() { System.out.print("b "); }
    Building(String name) {
        this(); System.out.print("bn " + name);
    }
}
public class House extends Building {
    House() { System.out.print("h "); }
    House(String name) {
        this(); System.out.print("hn " + name);
    }
    public static void main(String[] args) { new House("x "); }

    // Result: C.    -> b h hn x
}