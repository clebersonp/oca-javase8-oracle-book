/*
Compilar dentro do diretorio example_6: javac Test.java
*/

package example_6;

public class Test {

    /*
        Se houver algum construtor definido na class, o compilador não ira gerar o
        construtor default, somente irá adicionar a instrução super() no construtor:
    */
    public Test (String s) {
        // super(); o compilador adiciona automaticamente
    }
}