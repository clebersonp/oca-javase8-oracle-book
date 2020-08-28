/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.time.*;
import java.time.format.*;

public class Test {
    public static void main(String[] args) {

        /*
            2 passos para formatar uma data e representa-la como string:
            1 - Usar formatos e patterns da imensa lista que a classe DateTimeFormatter prove;
            2 - As classes LocalDate, LocalDateTime e LocalTime usam o metodo format() com o objeto
                DateTimeFormatter como argumento. Ou usar o metodo DateTimeFormatter.format() e
                passar o calendario(data) como argumento;
        */

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy G");
        DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("k:m:s A a");

        LocalDate d = LocalDate.now();
        String s = d.format(f1);
        System.out.println(s);
        System.out.println(d.format(f2));

        LocalTime t = LocalTime.now();
        System.out.println(t.format(tf1));

    }
}