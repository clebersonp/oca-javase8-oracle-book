/*
Compilar dentro do diretorio example_1: javac ReferenceTest.java
Executar dentro do diretorio example_1: java -cp ../ example_1.ReferenceTest
*/

package example_1;

import java.awt.Dimension;
import java.util.Objects;

public class ReferenceTest {
    public static void main(String[] args) {

        Dimension d = new Dimension(5, 10);
        System.out.println(String.format("Before change, d.height = %s", d.height));

        new ReferenceTest().modify(d);

        System.out.println(String.format("After change, d.height = %s", d.height));

    }

    /*
        Eh feito a copia da referencia ao passar a referencia em metodos, ou seja,
        a referencia do chamador quando a referencia do chamado(metodo) apontam para
        o mesmo objeto no heap, ou seja, qualquer mudando no objeto dentro do metodo
        sera refletido no unico objeto já que as duas referencias apontam para o mesmo
        objeto;

    */
    void modify(Dimension dim) {
        if (Objects.nonNull(dim)) {
            dim.height = dim.height + 1;
            System.out.println(String.format("Changing dim.height = %s", dim.height));
        }
    }
}