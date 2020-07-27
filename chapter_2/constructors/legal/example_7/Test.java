/*
Compilar dentro do diretorio example_7: javac Test.java
*/

package example_7;

public class Test {

    /*
        Isso eh um metodo e não um construtor, portanto, o compilar ira adicionar um construtor default
    */
    void Test(String s) {}

    /*
        Se não houver nenhum construtor definido na class, o compilador ira gerar o
        construtor default com mesmo modificar de acesso, como exemplo abaixo:
    */
    public Test() {
        super();
    }
}