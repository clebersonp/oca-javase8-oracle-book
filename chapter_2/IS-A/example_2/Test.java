/*
Compilar dentro do diretorio example_2: javac -cp ../ Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {
        File a = new InternFile();
        File b = new ExternFile();

        System.out.println(String.format("Is a instance of File? %s", a instanceof File));
        System.out.println(String.format("Is b instance of File? %s", b instanceof File));
        System.out.println(String.format("Is a instance of InternFile? %s", a instanceof InternFile));
        System.out.println(String.format("Is b instance of ExternFile? %s", b instanceof ExternFile));
        System.out.println("===================================");
        System.out.println(String.format("Is b instance of InternFile? %s", b instanceof InternFile));
        System.out.println(String.format("Is a instance of ExternFile? %s", a instanceof ExternFile));
    }
}