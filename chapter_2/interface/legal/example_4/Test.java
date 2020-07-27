/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

class NotFoundException extends Exception {}

class ResourceNotFoundException extends NotFoundException {}

interface Bounceable {
    void bounce() throws NotFoundException;
    void boundary() throws NotFoundException;
    Ball kicks(String ballName) throws NotFoundException;
}

abstract class Ball {
    public abstract void fallDown() throws NotFoundException;
}

class BeachBall extends Ball implements Bounceable {
    
    private String name;

    /*
        Override method pode lancar exceptions subtype
    */
    @Override
    public void fallDown() throws ResourceNotFoundException {
        System.out.println("Beach ball is fall down!");
    }

    /*
        Override method pode lancar nos exceptions não checadas, ou seja, extends RuntimeExceptions
    */
    @Override
    public void bounce() throws IllegalArgumentException {
        System.out.println("The beach ball is bouncing....");
    }

    /*
        Override method não precisa lançar exceptions se não for usar
    */
    @Override
    public void boundary() {
        System.out.println("The beach ball is in the boundary ... ");
    }

    /*
        Override method pode lancar o mesmo tipo de exception da superclass,
        e pode retornar o mesmo tipo ou subtype da superclass
    */
    @Override
    public BeachBall kicks(String ballName) throws NotFoundException {
        BeachBall ball = new BeachBall();
        ball.setName(ballName);
        System.out.println(String.format("Kicks the ball: %s", ball));
        return ball;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ name: " + this.name + " ]";
    }
}

public class Test {
    public static void main(String[] args) {
        BeachBall beachBall = new BeachBall();
        beachBall.setName("Yellow beach ball");

        try {
            beachBall.fallDown();
        }catch (ResourceNotFoundException e) {}

        beachBall.bounce();
        beachBall.boundary();
        try {
            beachBall.kicks(beachBall.getName());
        } catch (NotFoundException e) {}
    }
}