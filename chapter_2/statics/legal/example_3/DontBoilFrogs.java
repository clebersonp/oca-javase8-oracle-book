/*
Compilar dentro do diretorio example_3: javac DontBoilFrogs.java
Executar dentro do diretorio example_3: java -cp ../ example_3.DontBoilFrogs
*/

package example_3;

interface FrogBoilable {
    static int getCtof(int cTemp) {
        return (cTemp * 9 / 5) + 32;
    }
    default String hop() { return "hopping"; }
}

public class DontBoilFrogs implements FrogBoilable {
    public static void main(String [] args) {
        new DontBoilFrogs().go();
    }

    void go() {
        System.out.println(hop()); // acessando um metodo default da interface
        System.out.println(FrogBoilable.getCtof(100)); // acessando um metodo static da interface
    }

}