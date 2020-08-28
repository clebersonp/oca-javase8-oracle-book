/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test 03021985
*/

package example_1;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String [] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate bday = null;
        try {
            bday = LocalDate.parse(args[0], f);
        } catch (java.time.DateTimeException e) {
            System.out.println("bad dates Indy");
            System.exit(0);
        }
        System.out.println("your birthday is: " + bday);
        System.out.println("a " + bday.getDayOfWeek());

        Period p1 = Period.between(bday, LocalDate.now());

        System.out.println("you've lived for: ");
        System.out.print(p1.getDays() + " days ");
        System.out.print(p1.getMonths() + " months ");
        System.out.println(p1.getYears() + " years ");

        int yearsOld = p1.getYears();
        if (yearsOld < 0 || yearsOld > 119)
            System.out.println("Wow, are you a time lord?");

        long tDays = bday.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("you-ve lived for " + tDays + " days, so for");

        System.out.println("you'll reach 30,000 days on " + bday.plusDays(30_000));

        LocalDate d2000 = LocalDate.of(2_000, 1, 1);
        Period p2 = Period.between(d2000, LocalDate.now());
        System.out.println("period since Y2K: " + p2);
    }
}