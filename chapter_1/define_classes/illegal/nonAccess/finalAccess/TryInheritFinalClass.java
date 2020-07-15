/*
Compilar a classe dentro do diretorio finalAccess: javac -cp ../../ TryInheritFinalClass.java
*/

package nonAccess.finalAccess;

// não compila pois a classe MyFinalClass está marcada com o modificador de não acesso "final"
public class TryInheritFinalClass extends MyFinalClass {
    public static void main(String[] args) {
        TryInheritFinalClass ti = new TryInheritFinalClass();

        System.out.println(ti.fullName("Jack", "Ake"));
    }
}