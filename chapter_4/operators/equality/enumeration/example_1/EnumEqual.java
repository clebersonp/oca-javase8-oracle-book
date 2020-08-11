/*
Compilar dentro do diretorio example_1: javac EnumEqual.java
Executar dentro do diretorio example_1: java -cp ../ example_1.EnumEqual
*/

/*
    Enum pode ser utilizado tanto == ou equals que o resultado será o mesmo:
    todo enum herda da class Enum e overrides o metodo equals de Object: Returns true if the specified object is equal to this enum constant.
*/

package example_1;

public class EnumEqual {
    enum Color { RED, BLUE }                            // ; eh opcional
    public static void main(String[] args) {
        Color c1 = Color.RED; Color c2 = Color.RED;
        if (c1 == c2) { System.out.println("=="); }
        if (c1.equals(c2)) { System.out.println(".equals"); }
    }
}