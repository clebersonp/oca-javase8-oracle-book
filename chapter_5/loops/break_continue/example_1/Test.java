/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

/*
    a keyword break eh usada para parar todo o bloco de execucao do loop mais interno;
    a keyword continue eh usada para parar somente a iteracao atual do loop mais interno, passando para a proxima iteracao

    continue só pode ser usado dentro de loops;
    break só pode ser usado dentro de loops e switch;
*/

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Inside loop, value is " + i);
            continue;
        }

        // o for acima eh equivalente ao for abaixo, sem a palavra continue;
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside loop, value is " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (Test.value() == i) {
                continue; // pula o valor 5
            }
            System.out.println("Inside loop, value is " + i); // não eh executado quando o valor eh 5
        }

        for (int i = 0; i < 10; i++) {
            if (Test.value() == i) {
                break; // para a execucao do for
            }
            System.out.println("Inside loop, value is " + i); // imprime só ate o valor 4
        }

    }

    public static int value() {
        return 5;
    }
}