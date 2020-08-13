/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        int price = 350;
        
        if (price < 300) {
            System.out.println("buy product");
        } else {
            if (price < 400) {
                System.out.println("get approval");
            }
            else {
                System.out.println("don't buy product");
            }
        }

        /*
            A estrutura acima é semelhante:

            if (price < 300) {
                System.out.println("buy product");
            } else if (price < 400) {
                System.out.println("get approval");
            } else {
                System.out.println("don't buy product");
            }
        
        */
    }
}