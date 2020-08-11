/*
Compilar dentro do diretorio example_1: javac Budgie.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Budgie
*/

package example_1;

public class Budgie {
    public static void main(String[] args) {
        Budgie b1 = new Budgie();
        Budgie b2 = new Budgie();
        Budgie b3 = b1;

        String s1 = "Bob";
        String s2 = "Bob";
        String s3 = "bob";

        /*
            Metodo equals() herdado de Object: this method returns true if and only if x and y refer to the same object (x == y has the value true)
            Metodo equals() da classe String eh overrided: The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
        
        
            equals() de Object olha somente o valor das referencias,
            equals() de String compara as sequencias de caracteres;
        
        */

        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}