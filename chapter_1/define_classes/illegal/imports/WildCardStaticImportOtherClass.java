package illegal.imports;

// importando todos métodos statics da classe LocalDate da huge libary do java utilizando Wildcard *.
import static java.time.LocalDate.*;

// importando todos métodos statics da classe LocalDateTime da huge libary do java utilizando Wildcard *.
import static java.time.LocalDateTime.*;

public class WildCardStaticImportOtherClass {
    public static void main(String[] args) {
        System.out.println(now()); // não compila, pois ambas classes importados todos metodos statics tem o metodo now(). O compilador não sabera qual invocar
    }
}
