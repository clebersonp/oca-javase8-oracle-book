/*
Compilar dentro do diretorio cert: javac -cp ../ UseRooTest.java
*/

package cert;

// não compila pois a class Cloo tenta acessar um método private da sua superclass, a qual não tem visibilidade
class UseRooTest {
    public static void main(String[] args) {
        Cloo c = new Cloo();
        c.testCloo();
    }
}