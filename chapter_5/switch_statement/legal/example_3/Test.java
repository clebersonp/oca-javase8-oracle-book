/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        // boxing its ok
        switch (new Integer(3)) {
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
        
        final int one = 1;
        final int two = 2;
        final int three = 3;

        switch (new Integer(2)) {
            case one:
                System.out.println("length is one");
                break;
            case two:
                System.out.println("length is two");
                break;
            case three:
                System.out.println("length is three");
                break;
            default:
                System.out.println("length is one");
        }

    }
}