/*
Compilar dentro do diretorio example_2: javac Tablet.java
*/

interface Gadget {
    void doStuff();
}
abstract class Electronic {
    void getPower() {
        System.out.println("plug in ");
    }
}
public class Tablet extends Electronic implements Gadget {
    
    /*
    Não compila: attempting to assign weaker access privileges; was public
    Não pode diminuir a nivel de acesso ao metodo da interface que eh "public"
    */
    void doStuff() {
        System.out.println("show book ");
    }
    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}