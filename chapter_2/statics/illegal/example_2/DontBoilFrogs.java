/*
Compilar dentro do diretorio example_2: javac DontBoilFrogs.java
*/

package example_2;

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


        /*
            NÃO COMPILA: Metodo static de interface só pode ser acessada pelo nome do type(nome da interface)
        */
        System.out.println(getCtof(100));

        DontBoilFrogs dbf = new DontBoilFrogs();
        /*
            NÃO COMPILA: Metodo static de interface só pode ser acessada pelo nome do type(nome da interface)
            Não aceita o truque da classe
        */
        System.out.println(dbf.getCtof(100));
    }

}