// Não compila pois as posições das instruções package e import estão trocadas.
// Depois da instrução import o compilador espera a definição ou de class, interface ou enum

import java.util.*;

package illegal.instructions.position;

public class ImportPackagePositionChanged {
    static public void main(String... arguments) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Don't compile");

        System.out.println(list);
    }
}