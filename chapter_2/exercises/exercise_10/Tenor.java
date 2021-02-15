/*
Compilar dentro do diretorio exercise_10: javac Tenor.java
Executar dentro do diretorio exercise_10: java -cp ../ exercise_10.Tenor
*/

package exercise_10;

public class Tenor extends Singer {
    public static String sing() { return "fa"; }
    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }

    // Result: B. -> fa la
}
class Singer { public static String sing() { return "la"; } }