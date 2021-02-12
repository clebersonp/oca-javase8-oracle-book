/*
Compilar dentro do diretorio exercise_11: javac OverAndOver.java
Executar dentro do diretorio exercise_11: java -cp ../ exercise_11.OverAndOver
*/

package exercise_11;

public class OverAndOver {
    static String s = "";
    public static void main(String[] args) {
        try {
            s += "1";
            throw new Exception();
        } catch(Exception e) { s += "2";
        }finally { s += "3"; doStuff(); s+= "4";
        }
        System.out.println(s);
    }
    static void doStuff() { int x = 0; int y = 7/x; }

    // Result: H. -> An exception is thrown with no other output
}