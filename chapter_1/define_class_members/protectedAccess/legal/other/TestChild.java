/*
Para compilar dentro do diretorio other: javac -cp ../ TestChild.java
Para executar dentro do diretorio other: java -cp ../ other.TestChild
*/

package other;

class TestChild {
    public static void main(String[] args) {
        Child c = new Child();
        c.testIt(); // invocando o metodo que acessará via inheritance a variavel de instancia 'x' da superclass
    }
}