/*
Compilar dentro do diretorio example_1: javac GarbageTruck.java
Executar dentro do diretorio example_1: java -cp ../example_1.GarbageTruck
*/

package example_1;

public class GarbageTruck {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        /* O objeto StringBuffer não é elegivel para ser removido
            pelo Garbage Collection pois existe uma thread viva
            que tem uma referencia apontando para o objeto no heap
        */


        sb = null;
        /* 
            Ao tornar uma referencia sb = null significa que a partir deste momento
            sb não referencia mais para o objeto StringBuffer no heap,
            desta forma, o objeto StringBuffer estará elegivel para ser removido
            pelo Garbage Collection e liberar espaço da memoria heap(onde vivem os objetos, exceto Strings)
            Strings vivem no poll de Strings e não no heap;
        */

    }
}