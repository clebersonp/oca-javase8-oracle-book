/*
Compilar dentro do diretorio example_7: javac Test.java
*/

package example_7;

class Animal {
    public void eat() throws Exception {}
    public void run() {}
}

class Dog extends Animal {
    public void eat() {/* não lança exception */}
    public String run(); // não compila pois o retorno não é compativel com void
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();

        d.eat(); // compila e não tem problema de não lançar exception
        a.eat(); // não compila, pois no super type lança exception, para corrigir tem que relançar a exception no metodo main
    }
}