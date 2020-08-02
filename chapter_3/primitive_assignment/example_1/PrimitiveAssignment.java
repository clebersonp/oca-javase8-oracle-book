/*
Compilar dentro do diretorio example_1: javac PrimitiveAssignment.java
Executar dentro do diretorio example_1: java -cp ../ example_1.PrimitiveAssignment
*/

package example_1;

public class PrimitiveAssignment {
    public static void main(String[] args) {

        int x_1 = 7;                        // atribuindo uma literal a variavel
        int x_2 = x_1 + 2;                  // atribuindo uma expressao e literal
        int x_3 = x_1 + x_2;                // atribuindo com expressao
        System.out.println(x_3);

        // Todo numero inteiro sem sufixo eh considerado um int
        byte b_1 = 27;                      // cast implicito de int para byte, OK 27 cabe em um byte
        byte b_2 = (byte) 27;               // cast explicito
        System.out.println(String.format("%d %d", b_1, b_2));


        // operações com numeros inteiros são convertidos sempre para o tipo int
        byte b_3 = 3;                                           // cast implicito de int para byte somente literal que caiba
        byte b_4 = 8;                                           // cast implicito de int para byte somente literal que caiba
        byte b_5 = 127;                                         // OK ainda cabe em um byte
        // byte b_6 = 128;                                      // Fora de range, precisa de cast explicito pois pode haver perda de precisão
        // byte b_7 = b_3 + b_4;                                // não compila, pois como eh uma atribuição a partir de uma operação de soma usando expressao
        // byte b_8 = ((byte) b_3) + ((byte) b_4);              // não compila, b_3 sera convertido para byte, b_4 sera convertido para byte, porem o resultado da soma sera convertida para int
        byte b_9 = (byte) (b_3 + b_4);                          // eh obrigado usar cast pois pode haver perda de precisão. Como eh uma atribuição a partir de uma operação de soma usando expressao
        System.out.println(b_9);



        // variavel primitivo só copia o valor e quando alterar o valor da variavel não altera as outras variaveis
        int a_1 = 1;
        System.out.println(String.format("a_1 = %d", a_1));
        int a_2 = a_1;
        a_2 = 30;
        System.out.println(String.format("a_1 = %d after change to a_2", a_1));


    }
}