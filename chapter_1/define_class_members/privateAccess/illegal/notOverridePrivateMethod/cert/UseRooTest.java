/*
Compilar dentro do diretorio cert: javac -cp ../ UseRooTest.java
*/

package cert;

// não compila pois a class Cloo tenta acessar um método private da sua superclass via override, a qual não tem visibilidade e não pode override private members da superclass
class UseRooTest {
    public static void main(String[] args) {
        Cloo c = new Cloo();
        System.out.println(c.doRooThings());
    }
}