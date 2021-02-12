/*
Compilar dentro do diretorio exercise_4: javac Flip2.java
Executar dentro do diretorio exercise_4: java -cp ../ exercise_4.Flip2
*/

package exercise_4;

public class Flip2 {
    public static void main(String[] args) {
        String o = "-";
        String[] sa = new String[4];
        for (int i = 0; i < args.length; i++)
            sa[i] = args[i];
        for (String n: sa) {
            switch(n.toLowerCase()) {
                case "yellow": o += "y";
                case "red":    o += "r";
                case "green":  o += "g";
            }
        }
        System.out.println(o);
    }

    // Given the command-line invocation: java Flip2 RED Green Yellow

    // Result: E. An exception is thrown at runtime
}