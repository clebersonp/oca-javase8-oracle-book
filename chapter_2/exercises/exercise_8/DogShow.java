/*
Compilar dentro do diretorio exercise_8: javac DogShow.java
Executar dentro do diretorio exercise_8: java -cp ../ exercise_8.DogShow
*/

package exercise_8;

class Dog {
    public void bark() { System.out.print("woof "); }
}
class Hound extends Dog {
    public void sniff() { System.out.print("sniff "); }
    public void bark() { System.out.print("howl "); }
}
public class DogShow {
    public static void main(String[] args) { new DogShow().go(); }
    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        ((Dog) new Hound()).sniff();
    }

    // Result: F.   -> Compilation fails with an error at line 20
}