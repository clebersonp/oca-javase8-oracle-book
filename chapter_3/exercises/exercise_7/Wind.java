/*
    Compilar dentro do diretorio exercise_7: javac Wind.java
    Executar dentro do diretorio exercise_7: java -cp ../ exercise_7.Wind
*/

package exercise_7;

public class Wind {
    int id;
    Wind(int i) { id = i; }
    public static void main(String[] args) {
        new Wind(3).go();
        // commented line
    }
    void go() {
        Wind w1 = new Wind(1);
        Wind w2 = new Wind(2);
        System.out.println(w1.id + " " + w2.id);
    }
    // When execution reaches the commented line, which are true? (Choose all that apply.)

    // Result: ABG. -> 1 2; Three Wind objects are eligible for garbage collection
}