/*
Compilar dentro do diretorio example_4: javac Test.java
*/

package example_4;

class Clothing {
    Clothing(String s) {}
}

/*
    Não compila, pois o compilador ira adicionar o construtor default que tem a instrução super() sem argumentos
    e a superclass Clothing não possui o construtor default, somente construtor com argumento
    Msg: constructor Clothing in class Clothing cannot be applied to given types; reason: actual and formal argument lists differ in length
*/
class TShirt extends Clothing {}

public class Test {
    public static void main(String[] args) {}
}