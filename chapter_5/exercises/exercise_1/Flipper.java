/*
Compilar dentro do diretorio exercise_1: javac Flipper.java
Executar dentro do diretorio exercise_1: java -cp ../ exercise_1.Flipper
*/

package exercise_1;

public class Flipper {
    public static void main(String[] args) {
       String o = "-";
       switch("RED".toLowerCase()) {
            case "yellow":
                o += "y";
            case "red":
                o += "r";
            case "green":
                o += "g";
       }
       System.out.println(o);
    }
    // Result: -rg
}