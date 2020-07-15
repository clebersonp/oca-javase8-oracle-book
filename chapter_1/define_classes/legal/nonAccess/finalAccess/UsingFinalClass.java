/*
Compilando a classe dentro do diretorio finalAccess: javac -cp ../../ UsingFinalClass.java
Executando a classe dentro do diretorio finalAccess: java -cp ../../ access.finalAccess.UsingFinalClass
*/

package nonAccess.finalAccess;

public class UsingFinalClass {
    public static void main(String[] args) {

        // MyFinalClass e final e por isso só posso utiliza-la, nunca herda-la
        MyFinalClass my = new MyFinalClass();
        System.out.println(my.fullName("Jack", "Ake"));
    }
}