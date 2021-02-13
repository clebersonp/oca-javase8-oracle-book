/*
    Compilar dentro do diretorio exercise_12: javac Telescope.java
    Executar dentro do diretorio exercise_12: java -cp ../ exercise_12.Telescope
*/

package exercise_12;

public class Telescope {
    static int magnify = 2;
    public static void main(String[] args) {
        go();
    }
    static void go() {
        int magnify = 3;
        zoomIn();
    }
    static void zoomIn() {
        magnify *= 5;
        zoomMore(magnify);
        System.out.println(magnify);
    }
    static void zoomMore(int magnify) {
        magnify *= 7;
    }
    

    // Result:. B. -> 10
}