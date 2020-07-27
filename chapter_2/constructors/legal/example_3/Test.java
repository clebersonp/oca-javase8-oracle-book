/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {

    // construtor default, pois não tem return type e tem o mesmo nome da class
    public Test() {}

    // embora tenha o mesmo nome da class, é um method pois possui um return type
    public String Test() {
        return "testing";
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.Test());
    }
}