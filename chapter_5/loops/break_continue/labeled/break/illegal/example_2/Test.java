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

        boolean isTrue = true;

        outer:
        for(int i = 0; i < 5; i++) {
            while(isTrue) {
                System.out.println("Hello");
                break outer;
            } // fim do loop interno
            System.out.println("Outer loop."); // Won't print
        }

        /*
            Não compila: Test.java:47: error: undefined label: outer
            Embora eu declarei o labeled no for anterior, esse bloco precisa declara o seu labeled tbm,
            não posso reutilizar o labeled acima sem configura-lo no for em que vou usar as
            keywords continue e break combinados do nome do labeled
        */
        
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