/*
Compilar dentro do diretorio exercise_6: javac Emu.java
Executar dentro do diretorio exercise_6: java -cp ../ exercise_6.Emu
*/

package exercise_6;

public class Emu {
    static String s = "-";
    public static void main(String[] args) {
       try {
           throw new Exception();
       } catch (Exception e) {
           try {
               try { throw new Exception();
               } catch (Exception ex) { s += "ic "; }
               throw new Exception(); }
           catch (Exception x) { s += "mc "; }
           finally { s += "mf "; }
       } finally { s += "of "; }
       System.out.println(s);
    }
    // Result: -ic mc mf of
}