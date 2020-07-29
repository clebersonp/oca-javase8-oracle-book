/*
Compilar dentro do diretorio exercice_9: javac Redwood.java
Executar dentro do diretorio exercice_9: java -cp ../ exercice_9.Redwood
*/

package exercice_9;

public class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }
    void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood) new Tree(), new Redwood());
    }
    void go2(Tree t1, Redwood r1) {
        /*
            Codigo compila, porem ao executar e lancada uma exception java.lang.ClassCastException
            por tentar converter uma instancia do tipo Tree em Redwood
        */
        Redwood r2 = (Redwood) t1;
        Tree t2 = (Tree) r1;
    }
}
class Tree {}