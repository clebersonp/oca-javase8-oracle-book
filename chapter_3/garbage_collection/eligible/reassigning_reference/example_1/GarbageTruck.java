/*
Compilar dentro do diretorio example_1: javac GarbageTruck.java
Executar dentro do diretorio example_1: java -cp ../example_1.GarbageTruck
*/

package example_1;

import java.util.Date;

public class GarbageTruck {
    public static void main(String[] args) {

        StringBuffer sb_1 = new StringBuffer("hello");
        StringBuffer sb_2 = new StringBuffer("goodbye");
        System.out.println(String.format("sb_1 antes da mudanca: %s", sb_1));
        System.out.println(String.format("sb_2 antes da mudanca: %s", sb_2));
        /* Os objetos StringBuffer "hello" e "goodbye" não são elegiveis para serem removidos
            pelo Garbage Collection pois existe uma thread viva
            que tem referencias apontando para os objetos no heap
        */

        sb_1 = sb_2; // redirecionando sb_1 para referenciar o objeto "goodbye"
        /* 
            Ao tornar uma referencia sb_1 apontando para o mesmo objeto que a referencia sb_2,
            significa que a partir deste momento sb_1 não referencia mais para o objeto StringBuffer "hello" no heap,
            desta forma, o objeto StringBuffer "hello" estará elegivel para ser removido
            pelo Garbage Collection e liberar espaço da memoria heap(onde vivem os objetos, exceto Strings)
            Strings vivem no poll de Strings e não no heap;
            Agora tanto sb_1 quanto sb_2 referenciam o mesmo objeto StringBuffer "goodbye" no heap
        */

        System.out.println(String.format("sb_1 depois da mudanca: %s", sb_1));
        System.out.println(String.format("sb_2 depois da mudanca: %s", sb_2));



        Date d2 = new GarbageTruck().getDate();
        // neste ponto, objeto Date d2 continua existindo no heap pois a referencia foi passada do metodo para a variavel d2

        System.out.println(String.format("Data d2 fora do metodo getDate(): %s", d2.toString()));
        
    }

    Date getDate() {
        Date d = new Date();
        StringBuffer now = new StringBuffer(d.toString());
        System.out.println(String.format("StringBuffer now local reference: %s", now));
        return d; // será retornada o ponteiro do objeto Date criado no heap para o chamador
    } // neste ponto o objeto StringBuffer now será elegivel para o Garbage Collection pois deixa de existir a referencia para o objeto
}