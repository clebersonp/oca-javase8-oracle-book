/*
Compilar dentro do diretorio exercise_6: javac Chrome.java
Executar dentro do diretorio exercise_6: java -cp ../ exercise_6.Chrome
*/

package exercise_6;

class X { void do1() {  } }
class Y extends X { void do2() {  } }

class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        // insert code here
        ((Y)x2).do2();
        // Inserted at line 16, will compile? (Choose all that apply.)
    }

    // Result: C.   -> ((Y)x2).do2();
}