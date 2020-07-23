package illegal;

/*
Compilar dentro do diretorio illegal: javac -cp ../ Test_A.java
Executar dentro do diretorio illegal: java -cp ../ legal.Test_A
*/

public class Test_A {

    public static void main(String[] args) {
        A a = new A();

        // não compila. Variaveis de instancia de B sao private, forcando o uso de getters and setters e encapsulamento
        a.size = 10;
        a.name = "B's name";
        a.color = "Blue";

        System.out.println(String.format("Size: %s, Name: %s, Color: %s", a.size, a.name, a.color));
    }

}