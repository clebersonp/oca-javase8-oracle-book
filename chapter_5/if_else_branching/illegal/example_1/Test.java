/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        int price = 350;

        /*
            Não compila. Não segue a estrutura correta para if-else:
            A estrutura correta eh: 'if(booleanExpression)', 'else if(booleanExpression)...n' vezes e por fim 'else'(opcional)
        */

        if (price < 100) {
            System.out.println("buy product");
        } else {
            System.out.println("don't buy product");
        } else if (price < 200) {
            System.out.println("get approval");
        }
    }
}