/*
    Compilar dentro do diretorio exercise_3: javac Literally.java
    Executar dentro do diretorio exercise_3: java -cp ../ exercise_3.Literally
*/

package exercise_3;

public class Literally {
    public static void main(String[] args) {
        int i1 = 1_000;         // line A
        int i2 = 10_00;         // line B
        int i3 = _10_000;       // line C
        int i4 = 0b101010;      // line D
        int i5 = 0B10_1010;     // line E
        int i6 = 0x2_a;         // line F
    }

    // Which lines WILL NOT compile? (Choose all that apply.)

    // Result: C. -> Line C;
}