/*
Para compilar dentro do diretorio constants: javac -cp ../ IllegalConstantsStructure.java
*/

package constants;

// A interface não compila;
// Todas constantes nas interfaces dever ser public static final.
// Para não ficar redundante, é só declarar as constantes sem os modificadores public static final que o compilador já resolve para nós
public interface IllegalConstantsStructure {
    private static final int A = 2;
    static protected final int B = 1;
}