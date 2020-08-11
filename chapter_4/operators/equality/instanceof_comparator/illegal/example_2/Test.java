/*
Compilar dentro do diretorio example_2: javac Test.java
*/

package example_2;

interface Foo { }
class A implements Foo { }
class B extends A { }

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        if (a instanceof Foo) {
            System.out.println("'a' IS-A a Foo directly");
        }
        if (b instanceof A) {
            System.out.println("'b' IS-A a A directly");
        }
        if (b instanceof Foo) {
            System.out.println("'b' IS-A a Foo indirectly");
        }

        /*
            Erro de compilação: array eh um objeto
        */
        B[] array_Bs = new B[3];
        if (array_Bs instanceof Foo) {
            System.out.println("array_Bs IS-A a Foo");
        }
    }
}