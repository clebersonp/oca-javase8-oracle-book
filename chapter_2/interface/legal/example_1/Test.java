/*
Compilar dentro do diretorio example_1: javac Test.java
Excecutar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

/*
Interface define o contrato que as classes concretas devem seguir;
Methodos abstracts são por default e implicitos com modificadores "public abstract", o compilar coloca para nós
*/
interface Bounceable {
    void bounce();
    void setBounceFactor(int bf);
}

/*
Implementando uma interface com a keyword implements;
Ao implementar uma interface, deve-se realizar o overriding dos metodos da interface com body, ou seja, metodos concretos quando a classe for concreta;

Não deve rebaixar a visibilidade do metodo;
o retorno tem que ser o mesmo ou subtype;
O nome do metodo deve ser o mesmo;
Não deve mudar a lista de argumentos;
Pode lançar novas exceptions não checadas;
Pode lançar a mesma exception checada ou subtype;
Não precisa declarar exception se não for utilizar;
A class abstract não precisa implementar metodos abstracts das interfaces se não precisar,
    porem a primeira class concreta deverá implements todos metodos abstracts das classes abstracts e interfaces;
Class abstract não pode ser instanciada com a keyword new
*/
abstract class Ball implements Bounceable {
    
    // implementando metodo da interface na classe abstract
    @Override
    public void setBounceFactor(int bf) {
        System.out.println(String.format("Bouncing %d time(s) ....", bf));
    }

    // declarando novo metodo abstract na classe Ball
    public abstract void setSize(int size);
}

/*
Class concreta deve implementar todos metodos abstracts da arvore da hierarquia de herança de classes abstracts e interfaces
*/
class BeachBall extends Ball {

    // implementando metodo da interface
    @Override
    public void bounce() {
        System.out.println("Bouncing interface....");
    }

    @Override
    public void setSize(int size) {
        System.out.println(String.format("Size of bouncing from abstracts class %d ....", size));
    }
}

public class Test {
    public static void main(String[] args) {
        BeachBall beachBall = new BeachBall();

        beachBall.bounce();
        beachBall.setBounceFactor(10);
        beachBall.setSize(5);
    }
}