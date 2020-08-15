/*
Compilar dentro do diretorio example_6: javac Test.java
Executar dentro do diretorio example_6: java -cp ../ example_6.Test
*/

package example_6;

public class Test {
    public static void main(String[] args) {

        /*
            1 - A primeira parte, declaração e inicialização é executada primeiro e somente uma vez;
            2 - A segunda parte (expressao boolean) eh verificada após a primeira parte e logo após a terceira parte;
            2 - A terceira parte (iteração) e executa sempre do chega ao fim do bloco do for;

            Formas de parar e sair da execução do bloco do for. Significa que se encontrar uma das palavras,
            a segunda e terceira parte do for não sera executada/verificada;
            1 - return;
            2 - break;
            3 - System.exit(); VM shuts down
        */


        Test.run_1();
        Test.run_2();
        Test.run_3();
    }

    public static void run_1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
            return;
        }
    }

    public static boolean run_2() {
        for (int x = 0; x < 10; x++) {
            System.out.println("x is " + x);
            return true;
        }
        return true;
    }

    public static void run_3() {
        for (int z = 0; z < 10; z++) {
            System.out.println("z is " + z);
            System.exit(z);
        }
    }
}