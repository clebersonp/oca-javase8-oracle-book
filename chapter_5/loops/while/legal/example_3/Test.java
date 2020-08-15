/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        /*
            a estrutura do-while eh semelhante a estrutura while com uma diferença,
            do-while sempre executara o loop pelo menos uma vez, para depois ser
            verificada a expressão boolean do argumento do while;
        */

        do {
            System.out.println("Inside loop");
        } while(false);

        do System.out.println("Inside loop"); while(true);

    }
}