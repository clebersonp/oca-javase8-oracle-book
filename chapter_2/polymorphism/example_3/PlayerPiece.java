package example_3;

public class PlayerPiece extends GameShape implements Animatable {
    public void movePiece() {
        System.out.println("moving game piece");
    }

    public void animate() {
        System.out.println("animating...");
    }

    @Override
    public void doSomethingGenerally() {
        System.out.println("doing some thing more specific");
    }

    @Override
    public void doSomethingAbstract() {
        System.out.println("doing some thing more concret");
    }
}