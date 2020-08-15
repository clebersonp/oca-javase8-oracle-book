/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {


        /*
            instrução labeled:
            Pode ser usado qualquer nome que siga o padrão de identificador valido no java,
            e deve fica localizado antes da instrução que deseja utiliza-lo e o fim da instrução
            deve ser finalizada com :

            labeled em loops é muito utilizado quando existe inner loops, e em um determinado loop interno
            deseja ser terminado e sair de todos os loops para seguir a proxima instrução;

            Ao utilizar o labeled em conjunto com as keywords continue e break, deve-se utilizar o nome do labeled
            seguido da keyword e terminado por ; Lembrando que o nome labeled deve existir fora do loop e ser um nome
            valido
        */
        
        /*
            Desde que o labeled seja um identificador java valido e 
            seja utilizado ANTES da instrução do loop, no caso o for(), está OK;
        */

        $outer:for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println("Hello is " + (i + 1));
                continue $outer;
            } // end of inner loop
            System.out.println("outer"); // Never prints
        }
        System.out.println("Good-bye");

        /*
            Posso declarar o labeled com o mesmo nome do labeled anterior,
            não tem problemas pois são escopos diferentes
        */

        $outer:for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.println("Hey is " + (i + 1));
                continue $outer;
            } // end of inner loop
            System.out.println("outer"); // Never prints
        }
        System.out.println("Good-bye again");
    }
}