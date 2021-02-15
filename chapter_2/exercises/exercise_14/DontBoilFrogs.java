/*
Compilar dentro do diretorio exercise_14: javac DontBoilFrogs.java
Executar dentro do diretorio exercise_14: java -cp ../ exercise_14.DontBoilFrogs
*/

package exercise_14;

interface FrogBoilable {
    static int getCtof(int cTemp) {
        return (cTemp * 9 / 5) + 32;
    }
    default String hop() { return "hopping "; }
}

public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }
    void go() {
        System.out.print(hop());
        System.out.println(getCtof(100));
        System.out.println(FrogBoilable.getCtof(100));
        DontBoilFrogs dbf = new DontBoilFrogs();
        System.out.println(dbf.getCtof(100));
    }

    // Result: EG.    -> Compilation fails due to an erro on lines 21 and 24
}