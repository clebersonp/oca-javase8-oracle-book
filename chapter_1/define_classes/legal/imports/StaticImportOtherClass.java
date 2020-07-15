package legal.imports;

// importando o método now de forma static da classe LocalDate da huge libary do java.
import static java.time.LocalDate.now;

public class StaticImportOtherClass {
    public static void main(String[] args) {
        System.out.println(now()); // será utilizado a classe LocalDate para invocar o metodo static now();
    }
}
