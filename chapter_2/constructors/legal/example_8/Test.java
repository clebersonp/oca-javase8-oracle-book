/*
Compilar dentro do diretorio example_8: javac Test.java
Executar dentro do diretorio example_8: java -cp ../ example_8.Test
*/

package example_8;

class Clothing {
    String s;
    Clothing(String s) {
        this.s = s;
    }
}

class TShirt extends Clothing {
    static String NAME = "Default name";
    TShirt() {

        /*
            Como na superclass não possui construtor default, sem argumentos,
            preciso chamar o super passando o argumento do construtor da superclass.
            keyword this e super para overload de construtores aceita somente variaveis static da classe,
            não aceita variaveis de instancia pois as variaveis ainda não foram inicializadas;
        */
        super(TShirt.NAME);
    }
}

public class Test {
    public static void main(String[] args) {
        TShirt t = new TShirt();
        System.out.println(t.s);
    }
}