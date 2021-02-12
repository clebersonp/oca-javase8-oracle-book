/*
Compilar dentro do diretorio exercise_7: javac CC.java
Executar dentro do diretorio exercise_7: java -cp ../ exercise_7.CC
*/

package exercise_7;


class SubException extends Exception {  }
class SubSubException extends SubException {  }

public class CC {
    public static void main(String[] args) {
    }

    void doStuff() throws SubException {  }

    // Result: C. Compilation fails due to an error on line 23
}

class CC2 extends CC { void doStuff() throws SubSubException {  } }

class CC3 extends CC { void doStuff() throws Exception {  } }

class CC4 extends CC { void doStuff(int x) throws Exception {  } }

class CC5 extends CC { void doStuff() {  } }