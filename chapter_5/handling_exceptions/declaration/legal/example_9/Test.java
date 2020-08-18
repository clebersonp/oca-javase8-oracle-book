/*
Compilar dentro do diretorio example_9: javac Test.java
Executar dentro do diretorio example_9: java -cp ../ example_9.Test
*/

package example_9;

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
        try {
            doStuff(5);
        } catch (MyCheckedException e) {
            System.out.println("Exceptions capturada....");
        }
    }

    /*
        Por mais que o metodo doMoreStuffs não lança e nem declara a exception MyCheckedException,
        não tem problema eu declarar neste metodo que pode lançar MyCheckedException, porem, todos
        os outros metodo da stack que invocarem este metodo(doStuff) deverá declarar na assinatura ou
        tratar
    */
    public static void doStuff(int i) throws MyCheckedException {
        doMoreStuffs(i);
    }

    public static void doMoreStuffs(int i) {
        
            if ((i % 2) != 0) {
                System.out.println("Resto");
            } else {
                System.out.println("Não tem resto...");
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