/*
Para compilar dentro do diretorio constants: javac -cp ../ LegalConstantsStructure.java
*/

package constants;

// A interface compila, pois as definições para constantes estão corretas.
// Todas constantes nas interfaces dever ser public static final
public interface LegalConstantsStructure {
    int A = 2; // forma mais correta, pois já é implicito que o compilador deixe desta forma: public static final int A = 2;
    public int B = 1; // redundante keyword public
    static int C = 3; // redundante keyword static 
    final int D = 4; // redundante keyword final
    public static int E = 5; // redundante keyword public static
    public final int F = 6; // redundante keyword public final
    static final int G = 7; // redundante keyword static final
    public static final int H = 8; // redundante keyword public static
    final static public int I = 9; // redundate keyword final static public
}