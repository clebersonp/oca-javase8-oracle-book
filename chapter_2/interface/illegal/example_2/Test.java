/*
Compilar dentro do diretorio example_2: javac Test.java
*/

package example_2;

/*
Interface define o contrato que as classes concretas devem seguir;
Methodos abstracts são por default e implicitos com modificadores "public abstract", o compilar coloca para nós
*/

interface Sphericable {
    void doSpherical();
}

/*
Não compila pois um interface não pode implements outras interfaces somente extends de interfaces
*/
interface Bounceable implements Sphericable {
    void bounce();
    void setBounceFactor(int bf);
}

public class Test {
    public static void main(String[] args) {}
}