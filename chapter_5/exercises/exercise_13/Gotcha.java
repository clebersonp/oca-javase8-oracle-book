/*
Compilar dentro do diretorio exercise_13: javac Gotcha.java
Executar dentro do diretorio exercise_13: java -cp ../ exercise_13.Gotcha
*/

package exercise_13;

public class Gotcha {
    public static void main(String[] args) {
        // insert code here
        
    }
    void go() {
        go();
    }

    /*
        And given the following three code fragments:
        I. new Gotcha().go();
        II. try { new Gotcha().go(); }
            catch (Error e) { System.out.println("ouch"); }
        
        III. try { new Gotcha().go(); }
        catch(Exception e) { System.out.println("ouch"); }
    */
    // Result: B. -> They will all compile
    //         E. -> Only one will complete normally
}