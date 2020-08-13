/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {
        
        int trueInt = 1;
        int falseInt = 0;
        
        // operações invalidas, pois if e else if só aceitam expressoes ou valores que resultam em boolean
        if (trueInt)
        if (trueInt == true)
        if(1)
        if(falseInt == false)
        
        
        // Operações validas pois resultam em um boolean
        if(trueInt == 1)
        System.out.println("trueInt == 1");
        if(falseInt == 0)
        System.out.println("falseInt == 0");

    }
}