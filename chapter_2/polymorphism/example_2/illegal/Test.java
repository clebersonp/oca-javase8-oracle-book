/*
Compilar dentro do diretorio illegal: javac Test.java 
*/

package illegal;

public class Test {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {}

class B {}

// não compila.
// No java só eh permitido herda diretamente de uma classe
class C extends A, B {}