/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

/*
    As declarações de exceptions que um metodo pode lançar tambem entram na assinatura do metodo.
    Assinatura do metodo: o retorno, tipos e lista de argumentos e checked exceptions que pode lançar;
    A keyword throws eh utilizada para declaração do metodo das exceptions que pode lançar;
    Não eh pq um metodo diz que pode lançar um exception que ele ira lançar;

    Todo metodo que lançar uma checked exception tambem deve declarar na assinatura do metodo a exception que pode lançar;

    Um metodo que chama outro metodo que pode lançar um checked exception indiretamente, ou deve declarar a exception na
    assinatura do metodo e "passar a bola" ou ao inves de declarar pode simplesmente tratar a exception, ou seja, usar
    o try-catch. Regra conhecida como "handle or declare, ou catch or declare"

    Quando for unchecked exception não precisa declarar na assinatura do metodo, e os metodos da stack
    que estiverem chamando não precisam tratar ou lançar a exception, mas se declarar não tem problema;
*/

public class Test {
    public static void main(String [] args) {
        doStuff(5);
    }

    public static void doStuff(int i) {
        doMoreStuffs(i);
    }

    /*
        Quando o metodo pode lançar uma checked exception diretamente
        ou indiretamente e não for tratar com try-catch deve-se declarar
        a exception na assinatura do metodo com a keyword throws, caso contrario
        não compila
    */
    public static void doMoreStuffs(int i) {
        try {
            if ((i % 2) != 0) {
                throw new MyCheckedException("Example of unchecked exception");
            }
            System.out.println("Não lançou exception...");
        } catch (MyCheckedException e) {
            System.out.println("Exception capturada e sera relançada:");
            throw e; // relançando a checked exception capturada, por isso precisa ser declarada no metodo: Test.java:47: error: unreported exception MyCheckedException; must be caught or declared to be thrown
        }
    }
}

/*
Criando minha propria exception;
Exceptions que herdam de Exception são checked exception;
Exceptions que herdam de Error ou RuntimeException são unchecked exception;
*/
class MyCheckedException extends Exception {
    public MyCheckedException(String msg) {
        super(msg);
        System.out.println("Passando pelo construtor da minha exception");
    }
}