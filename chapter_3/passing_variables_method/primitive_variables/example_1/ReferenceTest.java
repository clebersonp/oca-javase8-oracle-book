/*
Compilar dentro do diretorio example_1: javac ReferenceTest.java
Executar dentro do diretorio example_1: java -cp ../ example_1.ReferenceTest
*/

package example_1;


public class ReferenceTest {
    public static void main(String[] args) {

        int a = 1;
        System.out.println(String.format("Before modify() a = %s", a));

        new ReferenceTest().modify(a);

        System.out.println(String.format("After modify() a = %s", a));

    }

    /*
        Eh feito a copia do valor da variavel primitiva int para o metodo;
        Quando eh alterada dentro do metodo, não reflete a variavel de fora,
        pois eh feita a copia do valor que eh literal inteira;
        Variaveis primitivas não usam ponteiros para apontar para o heap,
        mas usam o proprio valor literal(bits) armazenado nela;
    */
    void modify(int number) {
        
        number = number + 1;
        System.out.println(String.format("Changing number = %s", number));
    }
}