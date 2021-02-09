/*
Compilar dentro do diretorio exercise_4: javac Dims.java
Executar dentro do diretorio exercise_4: java -cp ../ exercise_4.Dims
*/

package exercise_4;

public class Dims {
    public static void main(String[] args) {
        int[][] a = {{1,2}, {3,4}};
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
        int[] b2 = (int[]) o1; // conversão de dimensões incorretas de array
        System.out.println(b[1]);
    }
    // Result: RuntimeException.
}