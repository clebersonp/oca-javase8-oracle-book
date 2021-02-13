/*
    Compilar dentro do diretorio exercise_2: javac Fishing.java
    Executar dentro do diretorio exercise_2: java -cp ../ exercise_2.Fishing
*/

package exercise_2;

public class Fishing {
    public static void main(String[] args) {
        byte b1 = 4;
        int i1 = 123456;
        long L1 = (long)i1;     // line A
        short s2 = (short)i1;   // line B
        byte b2 = (byte)i1;     // line C
        int i2 = (int)123.456;  // line D
        byte b3 = b1 + 7;       // line E
    }

    // Which lines WILL NOT compile? (Choose all that apply)

    // Result: E. -> Line E
}