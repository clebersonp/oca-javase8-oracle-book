/*
    Compilar dentro do diretorio exercise_9: javac Happy.java
    Executar dentro do diretorio exercise_9: java -cp ../ exercise_9.Happy
*/

package exercise_9;

public class Happy {
    int id;
    Happy(int i) { id = i; }
    public static void main(String[] args) {
        Happy h1 = new Happy(1);
        Happy h2 = h1.go(h1);
        System.out.println(h2.id);
    }
    Happy go(Happy h) {
        Happy h3 = h;
        h3.id = 2;
        h1.id = 3;
        return h1;
    }

    // Result:. D-> Compilation fails
}