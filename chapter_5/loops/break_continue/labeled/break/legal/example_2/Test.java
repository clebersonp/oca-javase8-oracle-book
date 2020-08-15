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

        for(int i = 0; i < 3; i++) {
            
            _$__123__$$$outer: // termina a execução desse bloco for e executa a proxima instrução, que é o for mais externo
            for(int j = 0; j < 2; j++) {
                
                for (int k = 0; k < 2; k++) {
                    System.out.println("Hello, i is " + i + ", j is " + j + ", k is " + k);
                    break _$__123__$$$outer;
                } // fim do loop mais interno

                System.out.println("Inner loop."); // Won't print

            } // fim do loop menos interno

            // sera executada essa instrucao apos atingir o alvo do labeled _$__123__$$$outer,
            // pois eh a primeira instrução apos o labeled
            System.out.println(" Outer labeled loop.");

        } // fim do loop externo
        System.out.println("Good-bye");
    }
}