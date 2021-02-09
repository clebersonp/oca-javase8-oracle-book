/*
Compilar dentro do diretorio exercise_18: javac Bachelor.java
Executar dentro do diretorio exercise_18: java -cp ../ exercise_18.Bachelor
*/

package exercise_18;

import java.time.*;

public class Bachelor {
    public static void main(String[] args) {
       LocalDate d = LocalDate.of(2018, 8, 15);
       d = d.plusDays(1);
       LocalDate d2 = d.plusDays(1);
       LocalDate d3 = d2;
       d2 = d2.plusDays(1);
       System.out.println(d + " " + d2 + " " + d3); // line x
    }
    // Result: 1 objeto do tipo LocalDate estara elegivel para o GC na linha x, 2018-08-16 2018-08-18 2018-08-17
}