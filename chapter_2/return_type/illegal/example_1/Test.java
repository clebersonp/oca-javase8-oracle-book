/*
Compilar dentro do diretorio example_1: javac Test.java
*/

package example_1;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.bar());
    }

    /*
        NÃO COMPILA. Method void não pode retornar valor
        Msg: incompatible types: unexpected return value
    */
    public void bar() {
        return "this is it"; // o método é void, não pode retornar valor
    }
}