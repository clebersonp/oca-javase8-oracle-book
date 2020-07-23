package class_x_interface;

public class ConcreteClass extends MyAbstractClass implements MyInterface {

    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public void sayHello() {
        System.out.println(String.format("Saying HELLO from concrete class '%s'", "ConcreteClass"));
    }

}