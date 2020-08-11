/*
    Compilar dentro do diretorio exercise_11: javac Tester.java
    Executar dentro do diretorio exercise_11: java -cp ../ exercise_11.Tester
*/

package exercise_11;

class Beta { void doSomething() { System.out.println("Something...."); } }
class Alpha {
    static Beta b1;
    Beta b2;
}

public class Tester {
    public static void main(String[] args) {
        Beta b1 = new Beta();       Beta b2 = new Beta();
        Alpha a1 = new Alpha();     Alpha a2 = new Alpha();
        // a1.b1.doSomething(); null pointer
        a1.b1 = b1;
        a1.b1.doSomething(); // ok
        a1.b2 = b1;
        a2.b2 = b2;
        a1 = null; b1 = null; b2 = null;
        // do stuff

        a1.b1.doSomething(); // ok pois eh static e pode ser acessado via referencia ou via Class
        Alpha.b1.doSomething();

        /*
            Neste ponto somente 1 objeto estara elegivel para o GC:

            a2 aponta para objeto Alpha;
            a2.b2 aponta para objeto Beta;
            Alpha.b1(não depende do objeto, somente da class) aponta para objeto Beta;

            o objeto Alpha que era apontado por a1 estara elegivel para o GC;
        */
    }
}