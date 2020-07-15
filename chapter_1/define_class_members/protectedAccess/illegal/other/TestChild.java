/*
Para compilar dentro do diretorio other: javac -cp ../ TestChild.java
Para executar dentro do diretorio other: java -cp ../ other.TestChild
*/

package other;

class TestChild {
    public static void main(String[] args) {
        Child c = new Child();

        // não compila pois está invocando o membro protected via referencia de instancia
        // onde a subclass e a superclass estão em diferentes packages;
        System.out.println(c.x);
    }
}