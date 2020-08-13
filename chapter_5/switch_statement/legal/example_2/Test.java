/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        String s = "xyz";

        /*
            Desde que a expressão do parametro do switch retorne o tipo compativel que possa ser avaliado ok.
            tipos compativeis: char, byte, short, int, enum e String
        */
        switch (s.length()) {
            case 1:
                System.out.println("length is one");
                break;
            case 2:
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