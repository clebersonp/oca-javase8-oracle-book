/*
Compilar dentro do diretorio structure: javac -cp ../ TestEnum.java
Executar dentro do diretorio structure: java -cp ../ structure.TestEnum 
Verificar os bytecode .class dentro do diretorio structure: javap -c -cp ../ CoffeeSizeEnum.class
*/


package structure;

public class TestEnum {

    public static void main(String[] args) {

        for (CoffeeSizeEnum c : CoffeeSizeEnum.values()) {
            System.out.println(c + " is " + c.getOunces() + " ounces and LidCode is " + c.getLidCode());
        }

    }

}