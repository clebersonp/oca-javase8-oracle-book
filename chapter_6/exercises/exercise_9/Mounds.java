/*
Compilar dentro do diretorio exercise_9: javac Mounds.java
Executar dentro do diretorio exercise_9: java -cp ../ exercise_9.Mounds
*/

package exercise_9;

public class Mounds {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = new String();
        for(int i = 0; i < 1000; i++) {
            s = " " + i;
            sb.append(s);
            System.out.println(s);
        }
        // done with loop
    }
    // Result: Se o GC não executar, teriam +- 1000 objetos em memoria
}