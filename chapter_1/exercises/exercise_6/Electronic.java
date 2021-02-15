/*
Compilar dentro do diretorio exercise_6: javac Electronic.java
Executar dentro do diretorio exercise_6: java -cp ../ exercise_6.Electronic
*/

package exercise_6;

public class Electronic implements Device {
    public void doIt() { }
    public static void main(String[] args) {
        System.out.print("Done");
    }
    
    // Result:
    // A.    ->  Compilation succeds
}

abstract class Phone1 extends Electronic {  }

abstract class Phone2 extends Electronic
    { public void doIt(int x) {  } }

class Phone3 extends Electronic implements Device
    { public void doStuff() {  } }

interface Device { public void doIt(); }