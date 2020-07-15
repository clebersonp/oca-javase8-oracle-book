package legal.imports;

// importando todos métodos statics da classe LocalDate da huge libary do java utilizando Wildcard *.
// pode utilizar todos metodos static e constants sem informar o nome da classe, porem fica mais dificil a leitura do código
import static java.time.LocalDate.*;

public class WildCardStaticImportOtherClass {
    public static void main(String[] args) {
        System.out.println(now()); // será utilizado a classe LocalDate para invocar o metodo static now();
    }
}
