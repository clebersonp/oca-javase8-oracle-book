package class_x_interface;

public abstract class MyAbstractClass {
    
    // construtores não são herdados
    public MyAbstractClass(){
        super();
    }

    // instance init block não são herdados
    {
        System.out.println("Instance init block");
    }

    // static init block não são herdados
    static {
        System.out.println("Static init block");
    }

    // variaveis de instancia são herdadas
    public String name;

    // variaveis statics são herdadas
    public static final String COLOR = "Blond";

    // methods abstracts são herdados
    public abstract void sayHello();

    // instance methods são herdados
    public void sayHelloWorld() {
        System.out.println("Saying HELLO WORLD");
    }

    // static methods são herdados
    public static void sayBye() {
        System.out.println("Saying bye bye!");
    }
}