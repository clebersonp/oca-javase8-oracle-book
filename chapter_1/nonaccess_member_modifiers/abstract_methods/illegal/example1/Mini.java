/*
Compilar as classes dentro do diretorio illegal.example1: javac -cp ../../ Mini.java
*/


package illegal.example1;

/*
Não compila pois a classe concreta deve implementar todos os metodos abstracts das superclasses;
*/
public class Mini extends Car {

    public void doNothing() {
        System.out.println("Doing nothing");
    }

    public static void main(String[] args) {
        Mini m = new Mini();
        m.doNothing();
        m.setType("Type is Mini"); // acessando metodo concreto da superclass Vehicle
        System.out.println(m.getType()); // acessando metodo concreto da superclass Vehicle
    }
}