/*
Compilar dentro do diretorio exercise_15: javac Jackets.java
Executar dentro do diretorio exercise_15: java -cp ../ exercise_15.Jackets
*/

package exercise_15;

import java.util.*;

public class Jackets {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();   // line 5
        myList.add(new Integer(5));
        myList.add(42);                             // line 7
        myList.add("113");                          // line 8
        myList.add(new Integer("7"));               // line 9
        System.out.println(myList);
    }
    // Result: Compilation erro na linha 8
}