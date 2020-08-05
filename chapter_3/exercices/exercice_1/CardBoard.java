/*
    Compilar dentro do diretorio exercice_1: javac CardBoard.java
    Executar dentro do diretorio exercice_1: java -cp ../ exercice_1.CardBoard
*/

package exercice_1;

public class CardBoard {

    Short story = 200;              // auto casting pois 200 literal cabe no short(32767)
    short story_2 = 32_767;         // auto casting pois 200 literal cabe no short(32767)
    // short story_3 = 32_768;         // não compila pois ultrapassa o range, deve-se fazer o casting
    CardBoard go(CardBoard cd) {
        cd = null;
        return cd;
    }

    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;

        // do stuff
        // 2 objetos estaram elegiveis para serem removidos pelo GC neste ponto,
        // o objeto que era apontado pela referencia c1, e o objeto wrapper story
        // que tbm deixa de ser acessado pois não existe nenhuma referencia;
    }
}