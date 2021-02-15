/*
Compilar dentro do diretorio exercise_5: javac pkgA/Foo.java pkgB/Baz.java 
Executar dentro do diretorio exercise_5: java -cp ../ exercise_5.pkgB.Baz
*/

package exercise_5.pkgB;

import exercise_5.pkgA.*;

public class Baz {
    public static void main(String [] args) {
        Foo f = new Foo();
        System.out.print(" " + f.a);
        System.out.print(" " + f.b);
        System.out.println(" " + f.c);
    }

    // Result:
    // DE.    -> Compilation fails with an error on line 13 and 14
}