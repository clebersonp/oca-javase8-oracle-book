/*
Compilar dentro do diretorio example_1: javac Test.java
*/

package example_1;

public class Test {
    
    public int testCount = 0;

    public Test() {
        testCount += 1;
    }

    public int getTestCount() {
        return this.testCount;
    }

    public static void main(String[] args) {
        new Test();
        new Test();
        new Test();
        new Test();

        /*
            NÃO COMPILA.
            Metodos statics não podem acessar variaveis ou methods de instancia(objeto)
            Msg: non-static variable testCount cannot be referenced from a static context
            Msg: non-static method getTestCount() cannot be referenced from a static context
        */
        System.out.println(String.format("Test count is now %d", testCount));
        System.out.println(String.format("Test count is now %d", getTestCount()));
    }
}