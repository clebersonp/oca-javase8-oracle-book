/*
Compilar dentro do diretorio example_2: javac Test.java
*/

package example_2;

public class Test {

    public String name;

    public Test() {}

    // Overload de construtores
    public Test(String name) {
        /*
            NÃO COMPILA. Não pode ser invocado construtores com keyword this e super no mesmo construtor, ou um ou outro;
            Msg: call to super must be first statement in constructor
        */
        this();
        super();
        this.name = name;
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}