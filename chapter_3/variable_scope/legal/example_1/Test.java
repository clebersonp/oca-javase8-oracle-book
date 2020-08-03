/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class Layout {
    static int s = 343;                                 // variavel static vive enquanto a class estiver carregada na JVM e é compartilhada
    int x;                                              // variavel de instancia vive enquanto o objeto estiver na area heap
    {                                                   // variaveis criadas no bloco de inicializacao vivem até o bloco finalizar a execucao
        System.out.println("Execucao do init block");
        System.out.println("Valor x no bloco init: " + x);
        x = 7; int x2 = 5;
    };
    Layout() {                                          // variaveis criadas nos construtores são variaveis locais e vivem até o fim da execucao do construtor
        super();
        System.out.println("Execucao do construtor");
        System.out.println("Valor x no construtor: " + x);
        x += 8; int x3 = 6;
    }

    /* variaveis locais vivem enquanto o metodo estiver na stack,
        se existir outra chamada de outro metodo, as variaveis do
        primeiro metodo continuam vivos na stack porem nao ficam acessiveis,
        só voltarão ser acessiveis que o segundo metodo terminar a sua
        execucao e sair da stack, ai o metodo anterior volta para stack
        e suas variaveis ficam acessiveis
    */
    int doStuff() {                                     
        int y = 0;
        for (int z = 0; z < 4; z++) {                   // variaveis de blocos só viem até o fim da execucao do bloco
            y += z + x;
        }
        return y;
    }
}

public class Test {
    public static void main(String[] args) {
        Layout l = new Layout();

        System.out.println(l.doStuff());
    }
}