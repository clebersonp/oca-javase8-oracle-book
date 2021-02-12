/*
Compilar dentro do diretorio exercise_16: javac Retread.java
Executar dentro do diretorio exercise_16: java -cp ../ exercise_16.Retread
*/

package exercise_16;

class MyException extends Exception {  }
class Tire {
    void doStuff()  {  }
}
public class Retread extends Tire {
    public static void main(String[] args) {
        new Retread().doStuff();
    }
    // insert code here
        System.out.println(7/0);
    }
    /*
        And given the following four code fragments:
        I.      void doStuff() {
        II.     void doStuff() throws MyException {
        III.    void doStuff() throws RuntimeException {
        IV.     void doStuff() throws ArithmeticException {
    */

    // When fragments I-IV are added, independently, at line 16, which are true?

    // Result: C. -> Some, but not all, will compile;
    //         D. -> All those that compile will throw an exception at runtime;
}



