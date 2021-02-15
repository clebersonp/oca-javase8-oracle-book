/*
Compilar dentro do diretorio exercise_16: javac IfaceTest.java
Executar dentro do diretorio exercise_16: java -cp ../ exercise_16.IfaceTest
*/

package exercise_16;
interface MyInterface {
    default int doStuff() {
        return 42;
    }
}
public class IfaceTest implements MyInterface {
    public static void main(String[] args) {
        new IfaceTest().go();
    }
    void go() {
        // INSERT CODE HERE
        System.out.println("class: " + doStuff());
        System.out.println("iface: " + MyInterface.super.doStuff());
    }
    public int doStuff() {
        return 43;
    }
    // Which line(s) of code, inserted independently at // INSERT CODE HERE, will allow the code to compile? (Choose all that apply.)
    // Result:
    // A.    -> System.out.println("class: " + doStuff());
    // C.    -> System.out.println("iface: " + MyInterface.super.doStuff());
}