/*
Compilar dentro do diretorio exercise_11: javac StatTest.java
Executar dentro do diretorio exercise_11: java -cp ../ exercise_11.StatTest
*/

package exercise_11;

// insert code here

class StatTest  {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }

    // Which, inserted independently at line 8, compiles? (Choose all that apply.)

    // Result:
    // C.    -> import static java.lang.Integer.*;
    // E.    -> import static java.lang.Integer.MAX_VALUE;
    
}