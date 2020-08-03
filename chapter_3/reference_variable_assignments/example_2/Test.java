/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

import java.awt.Dimension;

public class Test {
    public static void main(String[] args) {

        Dimension d1 = new Dimension(5, 10);
        System.out.println(String.format("Altura antes de copiar a referencia "
            + "para outra variavel. Valor 'd1.height': %s", d1.height));

        // copia o valor d1 para a1. O valor nao eh o objeto em si, mas eh o valor do ponteiro que referencia o objeto criado no heap
        // 2 ponteiros a1 e d1 apontando para o mesmo objeto no heap
        Dimension a1 = d1;

        a1.height = 30;

        System.out.println(String.format("Altura depois da copia da "
            + "referencia para outra variavel e alteracao. Valor 'd1.height': %s", d1.height));
    }
}