/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();

        /*
            Compila, porem como existe recursividade entre os metodos go() e doStuff(),
            ocorre exception do tipo java.lang.StackOverflowError;
            Exemplo semelhante ao deixar os construtores overloades recursivos;
        */
        t.go();
    }

    public void go() {
        doStuff();
    }

    public void doStuff() {
        go();
    }
}