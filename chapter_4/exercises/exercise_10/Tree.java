/*
Compilar dentro do diretoria exercise_10: javac Tree.java
Executar dentro do diretoria exercise_10: java -cp ../ exercise_10.Tree
*/

package exercise_10;

interface A { }
class B { }

interface Vessel { }
interface Toy { }
class Boat implements Vessel { }
class Speedboat extends Boat implements Toy { }

public class Tree {
    public static void main(String[] args) {

        String s = "0";
        Boat b = new Boat();
        Boat b2 = new Speedboat();
        Speedboat s2 = new Speedboat();

        /*
            instanceof: é verificado se a referencia da instancia do lado esquerdo
            pode ser testado como IS-A o tipo da class ou interface do lado direito
        */
        if ((b instanceof Vessel) && (b2 instanceof Toy)) s += "1";
        if ((s2 instanceof Vessel) && (s2 instanceof Toy)) s += "2";

        System.out.println(s);

        // print das classes das referencias das instancias de objeto
        System.out.println(b.getClass());
        System.out.println(b2.getClass());
        System.out.println(s2.getClass());

        /*
            instanceof com uma interface que não eh implementado não tem problema;
            só tem problema de compilacao quando instanceof eh usado com uma classe que
            não tem hierarquia entre a referencia da instancia(lado esquerdo) com o tipo(lado direito)
        */
        System.out.println(b instanceof Toy);
        System.out.println(b instanceof A);

        // não compila, pois o tipo da instancia de b(Boat) não pode ser convertida para class B,
        // ou seja, Boat não eh IS-A de B
        // System.out.println(b instanceof B);
    }
}