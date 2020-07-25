/*
Compilar dentro do diretorio example_4: javac Test.java
*/

abstract class Ball {

    public abstract void moveIt();

}

/*
Não compila pois uma classe não pode usar a keyword implements outra class, classes só pode extends 1 unica superclass
Msg: interface expected here
*/
class BeachBall implements Ball {
    
    @Override
    public void moveIt() {
        System.out.println("Move it");
    }
}

public class Test {
    public static void main(String[] args) {}
}