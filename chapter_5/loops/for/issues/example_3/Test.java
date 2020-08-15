/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

public class Test {
    public static void main(String[] args) {

        /*
            Declarando e inicializando a variavel fora do corpo do for;
            Incrementando a variavel dentro do bloco do for;
            Usando somente a segunda parte do for para verificar a expressao boolean
        */

        int i = 0;

        for ( ; i < 10; ) {
            System.out.println("i is " + i);
            i++;
        }


        /*
            Declarando a variavel fora do corpo do for;
            inicializando a variavel dentro do corpo do for;
            Incrementando a variavel dentro do bloco do for;
            Usando somente a segunda parte do for para verificar a expressao boolean
        */
        int z;

        for (z = 0 ; z < 5; ) {
            System.out.println("z is " + z++);
        }

        /*
            Posso usar essa variavel pois não eh local do for pois foi declarada fora do body do for;
        */
        System.out.println("z final value out side of for block is " + z);


    }
}