/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/


package example_2;

interface  Moveable {
    void moveIt();
}
interface Spherical {
    void doSphericalThing();
}

/*
Interface pode extends somente de outras interfaces;
Interface não usa keyword implements;
Interface não extends classes
*/
interface Bounceable extends Moveable, Spherical {
    void bounce();
    void setBounceFactor(int bf);
}

/*
Classe concreta deve implements todos metodos da interface Bounceable e todos os outros metodos das outras interfaces na arvore da hierarquia
*/
class Ball implements Bounceable {

    @Override
    public void moveIt() {
        System.out.println("Move it");
    }

    @Override
    public void doSphericalThing() {
        System.out.println("Do spherical thing");
    }

    @Override
    public void bounce() {
        System.out.println("bounce");
    }

    @Override
    public void setBounceFactor(int bf) {
        System.out.println(String.format("bounce factor %d", bf));
    }
}

public class Test {
    public static void main(String[] args) {

        Ball ball = new Ball();

        ball.moveIt();
        ball.doSphericalThing();
        ball.bounce();
        ball.setBounceFactor(10);

    }
}