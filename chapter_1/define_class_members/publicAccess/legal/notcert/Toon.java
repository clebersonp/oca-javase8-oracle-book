/*
Compilar dentro do diretorio notcert: javac -cp ../ Toon.java
Executar dentro do diretorio notcert: java -cp ../ notcert.Toon
*/

package notcert;

class Toon {
    public static void main(String[] args) {
        Cloo c = new Cloo();
        System.out.println(c.doRooThings()); // acessando o membro via dot .(referencia), porem esse metodo só existe na superclass que é herdado pela subclass Cloo
    }
}