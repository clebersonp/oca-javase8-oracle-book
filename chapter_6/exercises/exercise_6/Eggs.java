/*
Compilar dentro do diretorio exercise_6: javac Eggs.java
Executar dentro do diretorio exercise_6: java -cp ../ exercise_6.Eggs
*/

package exercise_6;

class Dozens {
    int[] dz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
}

public class Eggs {
    public static void main(String[] args) {
        Dozens [] da = new Dozens[3];
        da[0] = new Dozens();
        Dozens d = new Dozens();
        da[1] = d;
        d = null;
        da[1] = null;
        // do stuff, elegives pelo GC
    }
    // Result: 5 objetos são criado na memória; 2 objetos são elegives pelo GC
}