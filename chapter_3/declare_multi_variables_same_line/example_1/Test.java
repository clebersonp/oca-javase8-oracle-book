/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/


package example_1;

public class Test {
    public static void main(String[] args) {
        int a, b, c;

        int j, k=1, l, m=3;

        int d_1;
        int d_2 = 1;
        int d_3;
        int d_4 = 3;

        // a Ordem eh importante
        int e_1, e_2 = 1, e_3 = e_2 + 3;

        System.out.println(String.format("e_3 = %d", e_3));

        // int f_1, f_2 = f_4 + 3, f_3, f_4 = 1;        // A ordem importa e f_4 ainda n foi declara e inicializada ao fazer operacao de soma para resultado da variavel f_2

        // int g_1, g_2 = g_1 + 1, g_3;                 // A ordem importa e g_1 não foi inicializada ao fazer a operação de soma como resultado da variavel g_2
    }
}
