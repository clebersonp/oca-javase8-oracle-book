package illegal.imports;

//não compila, não é possivel importar subpacotes no java

import java.*;

public class ImportPackage {
    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
