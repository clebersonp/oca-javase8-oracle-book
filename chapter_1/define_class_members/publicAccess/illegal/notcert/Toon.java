/*
Compilar dentro do diretorio notcert: javac -cp ../ Toon.java
*/

package notcert;

// não compila pois a classe Cloo tenta herdar da classe Roo, mas não tem visibilidade pois a classe Roo é default(package level access)
class Toon {
    public static void main(String[] args) {
        Cloo c = new Cloo();
        System.out.println(c.doRooThings());
    }
}