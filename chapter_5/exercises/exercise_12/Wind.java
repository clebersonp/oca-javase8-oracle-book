/*
Compilar dentro do diretorio exercise_12: javac Wind.java
Executar dentro do diretorio exercise_12: java -cp ../ exercise_12.Wind
*/

package exercise_12;

public class Wind {
    public static void main(String[] args) {
        foreach:
        for(int j=0; j<5; j++) {
            for(int k=0; k<3; k++) {
                System.out.print(" " + j);
                if(j==3 && k==1) break foreach;
                if(j==0 || j==2) break;
            }
        }
    }

    // Result: C. -> 0 1 1 1 2 3 3
}