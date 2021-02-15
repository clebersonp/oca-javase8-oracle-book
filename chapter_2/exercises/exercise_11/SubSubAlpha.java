/*
Compilar dentro do diretorio exercise_11: javac SubSubAlpha.java
Executar dentro do diretorio exercise_11: java -cp ../ exercise_11.SubSubAlpha
*/

package exercise_11;

class Alpha {
    static String s = " ";
    protected Alpha() { s += "alpha "; }
}
class SubAlpha extends Alpha {
    private SubAlpha() { s += "sub "; }
}
public class SubSubAlpha extends Alpha {
    private SubSubAlpha() { s += "subsub "; }
    public static void main(String[] args) {
        
        /*
            Consigo acessar a variavel static de classe s pois SubSubAlpha extends de Alpha
            e pode ser acessada via SubSubAlpha.s ou via Alpha.s
        */
        new SubSubAlpha();
        System.out.println(s);
    }

    // Result: C.    -> alpha subsub
}