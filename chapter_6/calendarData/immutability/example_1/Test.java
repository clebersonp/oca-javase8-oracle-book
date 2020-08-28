/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String[] args) {

        /*
            Classes para manipular datas e horas são imutaveis assim como String
            
            java.time.format.DateTimeFormatter -> Formatter for printing and parsing date-time objects.
            java.time.LocalDateTime -> A date-time without a time-zone in the ISO-8601 calendar system, such as 2007-12-03T10:15:30.
            java.time.LocalDate -> A date without a time-zone in the ISO-8601 calendar system, such as 2007-12-03.
            java.time.LocalTime -> A time without a time-zone in the ISO-8601 calendar system, such as 10:15:30.
            java.time.Period -> A date-based amount of time in the ISO-8601 calendar system, such as '2 years, 3 months and 4 days'.
            java.time.Duration -> A time-based amount of time, such as '34.5 seconds'.


            java.time.temporal.TemporalAmount 
                Framework-level interface defining an amount of time, such as "6 hours", "8 days" or "2 years and 3 months".
                All Known Implementing Classes:
                Duration, Period


            Java API utiliza bastante o desing pattern 'factory pattern': factory class e factory method
            São maneiras de criar instancias de objetos sem utilizar sobrecarga de construtores, tornando
            a operação mais legivel. Ou seja, não eh possivel utilizar a keyword new para a nova API do java 8 de datas.
            Ex da classe LocalDate e seus metodos static para criar instancia do objeto:
                from()
                now()
                of()
                ofEpochDay()
                ofYearDay()
                parse()

        */

        LocalDate date1 = LocalDate.of(2017, 1, 31);
        Period period1 = Period.ofMonths(1);
        System.out.println(date1);
        date1.plus(period1); // como eh imutavel, o novo valor sera perdido
        System.out.println(date1);
        LocalDate date2 = date1.plus(period1); // como eh imutavel, esta reatribuindo o valor a variavel date2
        System.out.println(date2);

    }
}