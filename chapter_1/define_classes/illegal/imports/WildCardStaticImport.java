package illegal.imports;

// para compilar falta a instrução static apos a palavra import.
// Para usar o atalho de não precisar escrever System, ou seja, escrever somente out que é um membro static, precisa utilizar "import static"
import java.lang.System.out;

public class WildCardStaticImport {
    public static void main(String[] args) {

        // não compila, pois faltou a instrução static no import.
        out.println("Without System class for out static member");
    }
}
