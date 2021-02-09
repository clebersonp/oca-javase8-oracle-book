/*
Compilar dentro do diretorio exercise_17: javac Baking.java
Executar dentro do diretorio exercise_17: java -cp ../ exercise_17.Baking
*/

package exercise_17;

import java.util.*;

public class Baking {
    public static void main(String[] args) {
       ArrayList<String> steps = new ArrayList<String>();
       steps.add("knead");
       steps.add("oil pan");
       steps.add("turn on oven");
       steps.add("roll");
       steps.add("turn on oven");
       steps.add("bake");
       System.out.println(steps);
    }
    // Result: [knead, oil pan, turn on oven, roll, turn on oven, bake]
}