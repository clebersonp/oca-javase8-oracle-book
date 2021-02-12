/*
Compilar dentro do diretorio exercise_8: javac SpecialOps.java 
Executar dentro do diretorio exercise_8: java -cp ../ exercise_8.SpecialOps
*/

package exercise_8;

public class SpecialOps {
    public static void main(String[] args) {
        String s = "";
        boolean b1 = true;
        boolean b2 = false;
        if ((b2 = false) | (21%5) > 2)  s += "x";
        if (b1 || (b2 = true))          s += "y";
        if (b2 == true)                 s += "z";
        System.out.println(s);
    }
    
    // Result: C. -> y will be included in the output
}