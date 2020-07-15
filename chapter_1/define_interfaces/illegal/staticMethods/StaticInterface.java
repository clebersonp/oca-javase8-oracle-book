/*
Para compilar dentro do diretorio staticMethods: javac -cp ../ StaticInterface.java
*/

package staticMethods;

/*
Static interface methods são permitidos a partir do java 8;
Declara um method static usando a keyword static;
A keyword public é dedundante, já que o compilador o coloca para nós;
Static interface method não pode ser marcado com as keywords private, protected, final, abstract ou default;
Assim como os default interface method, a static interface method dever possuir método concreto, ou seja, possuir implementação e terminar com };
Para acessar um static interface method deve ser feito da maneira static, ou seja, o nome do tipo da interface seguido do operador . seguido do nome do method static;
*/

// Interface não compila, erros de definição de static methods
public interface StaticInterface {
    protected static int sum(int a, int b) { // keyword protected não é permitida em static interface method
        return a + b;
    }
    abstract static void doNothing(); // não pode usar a keyword abstract e todo static interface method precisa ser concreto, ou seja, precisa de implementação
}