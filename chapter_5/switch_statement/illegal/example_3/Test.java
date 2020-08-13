/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        String s = "xyz";

        /*
            Não compila, pois as expressões 'case' só avaliam igualdade, não pode ser usado nenhum outro
            tipo de operador de comparação
        */

        switch (s.length()) {
            case > 1:
                System.out.println("length is one");
                break;
            case s.length() >= 2:
                System.out.println("length is two");
                break;
            case 3:
                System.out.println("length is three");
                break;
            default:
                System.out.println("length is one");
        }
        
    }
}