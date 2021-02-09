/*
Compilar dentro do diretorio exercise_12: javac Fortress.java
Executar dentro do diretorio exercise_12: java -cp ../ exercise_12.Fortress
*/

package exercise_12;

import java.util.*;

public class Fortress {
    private String name;
    private ArrayList<Integer> list;
    Fortress() { list = new ArrayList<Integer>(); }
    String getName() { return name; }
    void addToList(int x) { list.add(x); }
    ArrayList getList() { return list; }
    // Result: Linha 17 quebra o encapsulamento pois o objeto é mutável

    public static void main(String [] args) {
        Fortress f = new Fortress();
        System.out.println(f);
    }
}