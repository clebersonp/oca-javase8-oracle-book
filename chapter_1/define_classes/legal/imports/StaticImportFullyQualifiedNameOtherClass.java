package legal.imports;

// importando todos métodos statics da classe LocalDate da huge libary do java utilizando Wildcard *.
import static java.time.LocalDate.*;

// importando todos métodos statics da classe LocalDateTime da huge libary do java utilizando Wildcard *.
import static java.time.LocalDateTime.*;

public class StaticImportFullyQualifiedNameOtherClass {
    public static void main(String[] args) {
        // como ambas classes foram importadas todos metodos statics e possuem o metodo now(),
        // precisa do nome completo das classes(fully qualified name) para resolver problema de ambiguidade
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalDateTime.now());
    }
}
