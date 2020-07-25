/*
Compilar dentro do diretorio example_3: javac Test.java
*/


package example_3;

interface  Moveable {
    void moveIt();
}
interface Spherical {
    void doSphericalThing();
}

/*
Interface pode extends somente de outras interfaces;
Interface não usa keyword implements;


Não compila pois interfaces não extends classes, somente interfaces
Msg: interface expected here
*/
interface Bounceable extends Moveable, Spherical, Ball {
    void bounce();
    void setBounceFactor(int bf);
}

class Ball {

    public void up() {
        System.out.println("Move it up");
    }
}

public class Test {
    public static void main(String[] args) {}
}