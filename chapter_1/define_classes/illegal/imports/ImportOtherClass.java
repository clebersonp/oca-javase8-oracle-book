package illegal.imports;

//não compila, faltou importar a classe ArrayList da huge libary do java do package java.util.ArrayList.

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

        System.out.println(list);
    }
}
