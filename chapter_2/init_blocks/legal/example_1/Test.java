/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class SmallInit {

    static { 
        System.out.println("First static init block run once, only when the class is loaded");
    }

    static int x;
    int y;

    /*
        Blocos de inicialização:
        Existem blocos statics, que não dependem de uma instance para serem executados;
        Existem blocos de instancia, que são executados logo apos todos as superclass serem instanciadas,
        ou seja, apos o retorno de todas as instruçoes super(), pois depende da existencia das instancias super();
        A ordem que os blocos foram criados na classe importa, ou seja,
        a execução será top -> down, respeitando a diferença entre static e instance blocks;
        Os blocos de init pode ir em qualquer parte dentro da class;
        Init blocks são usados para colocar códigos que podem ser compartilhados entre todos os construtores de uma class;
        Com os blocos de init existem 3 maneira de executar operações(conjunto de instruções no mesmo block),
        dentro de um init block, construtor e method;
    */

    static { 
        System.out.println("Second static init block run once, only when the class is loaded");
        x = 7;
    }

    {
        System.out.println("Instance init block run every time a class instance is created.");
        y = 8;
    }

    {
        System.out.println("Second init block running after the constructor's call to super().");
    }

    static { 
        System.out.println("Third static init block run once, only when the class is loaded");
    }
}

public class Test {
    public static void main(String[] args) {
        new SmallInit();
        new SmallInit();
    }
}