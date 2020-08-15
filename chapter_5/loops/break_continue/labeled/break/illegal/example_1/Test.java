/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

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
            Não compila pois o labeled não está antes do bloco que o usara, no caso do for()
        */

        outer:

        boolean isTrue = true;

        for(int i = 0; i < 5; i++) {
            while(isTrue) {
                System.out.println("Hello");
                break outer;
            } // fim do loop interno
            System.out.println("Outer loop."); // Won't print
        }
        System.out.println("Good-bye");
    }
}