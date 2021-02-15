/*
Compilar dentro do diretorio exercise_13: javac ZooKeeper.java
Executar dentro do diretorio exercise_13: java -cp ../ exercise_13.ZooKeeper
*/

package exercise_13;

class Mammal {
    String name = "furry ";
    String makeNoise() { return "generic noise"; }
}
class Zebra extends Mammal {
    /* não tem problema a subclass definir uma variavel de mesmo nome da superclass,
        O compilador e a JVM saberam qual será o name acessado pelo tipo da referencia do objeto.
    */
    String name = "stripes "; 
    String makeNoise() { return "bray"; }
}
public class ZooKeeper {
    public static void main(String[] args) { new ZooKeeper().go(); }
    void go() {
        Mammal m = new Zebra();

        /*
            Somente methods overrides podem ser acessados via polymorphism(pelo tipo do objeto).
            A variavel é acessada via tipo da referencia da variavel
        */
        System.out.println(m.name + m.makeNoise());
    }

    // Result: A.    -> furry bray
}