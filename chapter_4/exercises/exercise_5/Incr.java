/*
Compilar dentro do diretorio exercise_5: javac Incr.java 
Executar dentro do diretorio exercise_5: java -cp ../ exercise_5.Incr
*/

package exercise_5;

public class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;

        /*
            Result = 33;

            x   _   _;
            _   _   _;
            _   _   _;
            _   _   _;

            y   y   y   y
            y   x   x
            -=  *=  *=  *=
        */

        x *= x; // 49
        y *= y; // 4
        y *= y; // 16
        x -= y; // 33

        System.out.println(x);
    }
}