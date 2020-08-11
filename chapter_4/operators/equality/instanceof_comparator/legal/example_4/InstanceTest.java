/*
Compilar dentro do diretorio example_4: javac InstanceTest.java
Executar dentro do diretorio example_4: java -cp ../example_4.InstanceTest
*/

package example_4;

public class InstanceTest {
    public static void main(String[] args) {

        /*
            se usado uma referencia null para comparar instanceof sempre resultara em false,
            pois eh comparado o tipo da instancia e não o tipo da referencia;
        */

        String a = null;
        boolean b = null instanceof String;
        boolean c = a instanceof String;
        System.out.println(b + " " + c);

    }
}