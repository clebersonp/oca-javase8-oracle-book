/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

import java.io.IOException;

/*
    As declarações de exceptions que um metodo pode lançar tambem entram na assinatura do metodo.
    Assinatura do metodo: o retorno, tipos e lista de argumentos e checked exceptions que pode lançar;
    A keyword throws eh utilizada para declaração do metodo das exceptions que pode lançar;
    Não eh pq um metodo diz que pode lançar um exception que ele ira lançar;

    Todo metodo que lançar uma checked exception tambem deve declarar na assinatura do metodo a exception que pode lançar;

    Um metodo que chama outro metodo que pode lançar um checked exception indiretamente, ou deve declarar a exception na
    assinatura do metodo e "passar a bola" ou ao inves de declarar pode simplesmente tratar a exception, ou seja, usar
    o try-catch. Regra conhecida como "handle or declare, ou catch or declare"
*/

public class Test {
    public static void main(String [] args) {
        doStuff();
    }

    public static void doStuff() {
        doMoreStuffs();
    }

    /*
        Quando o metodo pode lançar uma checked exception diretamente
        ou indiretamente e não for tratar com try-catch, deve-se declarar
        a exception na assinatura dos metodos da stack com a keyword throws,
        caso contrário não compila
    */
    public static void doMoreStuffs() {
        throw new IOException("Example of checked exception"); // Test.java:39: error: unreported exception IOException; must be caught or declared to be thrown
    }
}