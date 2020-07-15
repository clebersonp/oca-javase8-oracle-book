package legal.imports;

// importando a classe ArrayList da huge libary do java.
import java.util.ArrayList;

public class ImportOtherClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        // utilizando fully qualified name para invocar o metodo now() do LocalDateTime
        System.out.println(java.time.LocalDateTime.now() + " " + list);
    }
}
