/*
Compilar dentro do diretorio exercise_12: javac MyInterface.java
Executar dentro do diretorio exercise_12: java -cp ../ exercise_12.MyInterface
*/

package exercise_12;

interface MyInterface {

    // insert code here
    default void m2() {;}
    abstract int m3();
    static void m6() {;}

    // Which lines of code--inserted independently at insert code here--will compile? (Choose all that apply.)
    // Result:
    // B.    -> default void m2() {;}
    // C.    -> abstract int m3();
    // F.    -> static void m6() {;}
    
}