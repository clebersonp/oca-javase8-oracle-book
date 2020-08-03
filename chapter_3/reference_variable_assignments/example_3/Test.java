/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        /*
            String são imutaveis, ou seja, qualquer operação retornara uma nova String ao inves de altera-la.
            Strings são armazenadas num local chamado poll de strings e são consideradas constantes, ou seja,
            nao existira 2 string iguais no poll de strings
        */

        // declarada variavel x do tipo String e inicializada com o valor "Java" que foi criado no poll de strings
        String x = "Java";

        // fazendo a copia do ponteiro de x para y, ou seja, ambos x e y apontam para o mesmo objeto no poll de strings
        String y = x;

        System.out.println(String.format("Valor de y antes da alteracao de x: %s", y));

        // x será criado novo objeto no poll de strings com o valor Java Bean e sera reatribuido a variavel x
        // a variavel y não será alterada, já que ela está apontando para o objeto no poll de strings com o valor Java
        x = x + " Bean";

        System.out.println(String.format("Valor de y despois da alteracao de x: %s", y));


        System.out.println(String.format("Novo valor de x despois de sua reatribuição: %s", x));


        String z = "Java";

        System.out.println(String.format("Valor do ponteiro de y: %s; Valor do ponteiro de z: %s", y.intern(), z.intern()));

        System.out.println(String.format("Valor do ponteiro de y e z eh o mesmo? %s", y == z));

    }
}