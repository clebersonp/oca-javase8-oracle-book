package staticMethods;

/*
Static interface methods são permitidos a partir do java 8;
Declara um method static usando a keyword static;
A keyword public é dedundante, já que o compilador o coloca para nós;
Static interface method não pode ser marcado com as keywords private, protected, final, abstract ou default;
Assim como os default interface method, a static interface method dever possuir método concreto, ou seja, possuir implementação e terminar com };
Para acessar um static interface method deve ser feito da maneira static, ou seja, o nome do tipo da interface seguido do operador . seguido do nome do method static;
*/

public interface StaticInterface {
    public static int sum(int a, int b) {
        return a + b;
    }
    static void doNothing() {
        System.out.println("DoNothing statid interface methods");
    }
}