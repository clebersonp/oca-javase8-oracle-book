/*
Compilar dentro do diretorio exercise_2: javac Hilltop.java
Executar dentro do diretorio exercise_2: java -cp ../ exercise_2.Hilltop eyra vafi draumur kara
*/

package exercise_2;

public class Hilltop {
    public static void main(String[] args) {
        String[] horses = new String[5];
        horses[4] = null;
        for (int i = 0; i < horses.length; i++) {
            if (i < args.length)
                horses[i] = args[i];
            System.out.println(horses[i].toUpperCase() + " ");
        }

        // Result. NullPointerException no index 4
    }
}