/*
Compilar dentro do diretorio example_1: javac Special.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Special
*/

package example_1;

public class Special {

    private StringBuilder name = new StringBuilder("bob");
    private StringBuilder city = new StringBuilder("San Francisco");

    StringBuilder getNameWithoutEncapsulation() { return this.name; }
    void printName() { System.out.println(this.name); }
    StringBuilder getCityWithEncapsulation() { return new StringBuilder(this.city); }
    void printCity() { System.out.println(this.city); }

    public static void main(String[] args) {

        Special sp = new Special();
        StringBuilder s2 = sp.getNameWithoutEncapsulation(); // se retornar a copia da referencia do objeto original, então não tem encapsulation
        s2.append("fred");
        sp.printName();

        StringBuilder s3 = sp.getCityWithEncapsulation(); // exemplo do verdadeiro encapsulation de uma referencia mutavel(StringBuilder) que faz a copia do valor para um nova referencia para não alterar o valor o objeto original
        s3.append("California");
        sp.printCity();
    }
}