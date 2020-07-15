/*
Compilar a classe dentro do diretorio finalAccess: javac -cp ../../ TryInheritStringClass.java
*/

package nonAccess.finalAccess;

// não compila pois a classe java.lang.String está marcada com o modificador de não acesso "final"
public class TryInheritStringClass extends String {
    public static void main(String[] args) {
        System.out.println("Trying to inheritance String class");
    }
}