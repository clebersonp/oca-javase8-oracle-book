package example_3;

public abstract class GameShape {
    public void displayShape() {
        System.out.println("displaying shape");
    }

    public void doSomethingGenerally() {
        System.out.println("doing some thing generally");
    }

    public abstract void doSomethingAbstract();
}