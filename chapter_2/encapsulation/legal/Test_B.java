package legal;

/*
Compilar dentro do diretorio legal: javac -cp ../ Test_B.java
Executar dentro do diretorio legal: java -cp ../ legal.Test_B
*/

public class Test_B {

    public static void main(String[] args) {
        B b = new B();

        // variaveis de instancia de B sao acessados por meio de getters and setters, utilizando encapsulamento
        b.setSize(10);
        b.setName("B's name");
        b.setColor("Blue");

        System.out.println(String.format("Size: %s, Name: %s, Color: %s", b.getSize(), b.getName(), b.getColor()));
    }

}