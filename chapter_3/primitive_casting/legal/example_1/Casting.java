/*
    Compilar dentro do diretorio example_1: javac Casting.java
    Executar dentro do diretorio example_1: java -cp ../ example_1.Casting
*/

package example_1;

public class Casting {
    public static void main(String[] args) {

        /*
            Dois tipo de casting: 1 - Explicito e Implicito;
            Explicito: large-value-into-small-container ex: long into short
            Implicito: small-value-into-large-container ex: int into long
        */

        int a = 100;
        long b = a;                     // implicit casting
        System.out.println(String.format(" long b = %d", b));


        float c = 100.001f;
        int d = (int) c;                // explicit casting
        System.out.println(String.format(" int d = %d", d));


        double e = 100L;                // implicit cast
        System.out.println(String.format(" double e = %.2f", e));


        int f = (int) 36.2516;          // explicit cast double to int, assume loss precision
        System.out.println(String.format(" int f = %d", f));


        long g = 56L;
        byte h = (byte) g;              // explicit cast
        System.out.println(String.format(" byte h = %d", h));


        // byte range (-128 ate 127 = 256)
        /*
            O que acontece:
            130 eh um int = 32 bits: 0000 0000 0000 0000 0000 0000 1000 0000
            eh removido todos os 24 bits a esquerda pois byte só aceita 8 bits e sobra 1000 0000
            eh realizada duas operacoes: 1 = troca todos os bits 0111 1111; 2 = soma 1 bit e volta para 1000 0000 = -128
            o bit mais a esquerda é o sinal, 1 = - e 0 = +
            e por ultimo adiciona os bits excedentes que agora são 2
            então fica 1000 0020 = -126 ou seja -128 + 2 bits = -126
        */
        int i = 130;
        byte j = (byte) i;              // 127 é o limite positivo, o excedente inicia do limit negativo, ex: sobrou 3, então limite negativo -128, -127, -126
        System.out.println(String.format(" byte j = %d", j));

        float k = 123.456F;
        short l = (short) k;
        System.out.println(String.format(" short l = %d", l));


        float m = (float) 456.654;      // explicit cast
        System.out.println(String.format(" short m = %.2f", m));



        byte n = 3;
        n += 7;                         // OK 7 cabe no byte, implicit cast, todos operadores compostos sera feito implicit cast: +=, -=, *=, /=
        System.out.println(String.format(" byte n = %d", n));


        byte o = 3;
        o = (byte) (o + 7);             // precisa de explicit cast pois a operação tem variavel, preciso assumir o risco de perder precisão
        System.out.println(String.format(" byte o = %d", o));


        byte p = 3 + 7;                 // implicit cast pois a operação de soma resulta em int mas 10 cabe no byte p, ou seja, operação com literais o compilar olha o resultado
        System.out.println(String.format(" byte p = %d", p));
        
    }
}