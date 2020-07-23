package illegal;

/*
Compilar dentro do diretorio illegal: javac -cp ../ Test_B.java
Executar dentro do diretorio illegal: java -cp ../ legal.Test_B
*/

public class Test_B {

    public static void main(String[] args) {
        B b = new B();

        // embora compila e roda, não é recomendado acessar as variaveis de instancia diretamente
        // pois não utiliza o conceito de encapsulamento
        b.size = 10;
        b.name = "B's name";
        b.color = "Blue";

        System.out.println(String.format("Size: %s, Name: %s, Color: %s", b.size, b.name, b.color));
    }

}