/*
Compilar dentro do diretorio exercise_5: javac Sequence.java
Executar dentro do diretorio exercise_5: java -cp ../ exercise_5.Sequence
*/

package exercise_5;

import java.util.*;

public class Sequence {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("carrot");
        myList.add("banana");
        myList.add(1, "plum");
        System.out.println(myList);
    }
    // Result: [apple, plum, carrot, banana]
}