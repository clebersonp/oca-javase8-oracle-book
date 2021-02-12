/*
Compilar dentro do diretorio exercise_9: javac Beyond.java
Executar dentro do diretorio exercise_9: java -cp ../ exercise_9.Beyond
*/

package exercise_9;

class Infinity { }

public class Beyond extends Infinity {
    static Integer i;
    public static void main(String[] args) {
        int sw = (int) (Math.random() * 3);
        switch(sw) {
            case 0: { for(int x = 10; x > 5; x++)
                            if(x > 10000000) x = 10;
                       break; }
            case 1: { int y = 7 * i; break; }
            case 2: { Infinity inf = new Beyond();
                    Beyond b = (Beyond) inf; }
        }
    }

    // Result: D. -> A NullPointerException might be thrown
    //         F. -> The program might hang without ever completing
}