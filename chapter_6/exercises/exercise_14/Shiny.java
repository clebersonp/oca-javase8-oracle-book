/*
Compilar dentro do diretorio exercise_14: javac Shiny.java
Executar dentro do diretorio exercise_14: java -cp ../ exercise_14.Shiny
*/

package exercise_14;

import java.time.*;
import java.time.format.*;

public class Shiny {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        LocalDate d = LocalDate.of(2018, Month.JANUARY, 15);
        LocalDate d2 = d.plusDays(1);
        System.out.print(f1.format(d) + " ");
        System.out.println(d2.format(f1));
    }
    // Result: jan. 15, 2018 jan. 16, 2018
}