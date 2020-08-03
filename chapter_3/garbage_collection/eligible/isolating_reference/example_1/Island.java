/*
Compilar dentro do diretorio example_1: javac Island.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Island
*/

package example_1;


/*
                                                                Garbage Collection ira remover os 3 objetos sem referencia,
                                                                i2, i3 e i4, mesmo que existam referencia entre eles,
                                                                desde que não existe referencia externa apontando para qualquer objeto no heap

                                                                
                                                                                          HEAP -> Objetos                 
                                                            ----------------------------------------------------------------
                                      \   /                 |                                                              |
   Referencias                         \ /                  |                                                              |    
                       i2 --------------/-------------------------------------------->  i2 <-----------------              |
                                       / \                  |                            |                  |              |
                                      /   \                 |                           i2.n                |              |
                                                            |                            |                  |              |
                                      \   /                 |                            !                  |              |
                                       \ /                  |                           \ /                 |              |
                       i3 --------------/---------------------------------------------> i3                  |              |
                                       / \                  |                            |                  |              |
                                      /   \                 |                           i3.n                |              |
                                                            |                            |                  |              |
                                      \   /                 |                            !                  |              |
                                       \ /                  |                           \ /                 |              |
                       i4 --------------/-------------------------------------------->  i4 ---i4.n---------->              |
                                       / \                  |                                                              |
                                      /   \                 |                                                              |
                                                            |                                                              |
                                                            |                                                              |
                                                            |                                                              |
                                                            |                                                              |
                                                            ----------------------------------------------------------------



*/

public class Island {
    Island n;
    public static void main(String[] args) {

        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();
        
        i2.n = i3;
        i3.n = i4;
        i4.n = i2;

        i2 = null;
        i3 = null;
        i4 = null;

        /*
            Neste ponto, mesmo que i2.n aponte para o objeto i3 e
            i3.n aponte para o objeto i4 e i4.n aponte para objeto i2,
            Carbage Collection ira removelos da memoria heap pois
            não existe mais referencias na thread viva apontando
            para qualquer um dos 3 objetos, se chama de Isolation
        */

    }
}