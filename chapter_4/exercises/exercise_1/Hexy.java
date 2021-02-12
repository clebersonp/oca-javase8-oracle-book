/*
Compilar dentro do diretorio exercise_1: javac Hexy.java 
Executar dentro do diretorio exercise_1: java -cp ../ exercise_1.Hexy
*/

package exercise_1;

public class Hexy {
    public static void main(String[] args) {
       int i = 42;
       String s = (i<40)?"life":(i>50)?"universe":"everything";
       System.out.println(s);
    }

    // Result: D. -> everything
}