/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

interface Foo { }
class A implements Foo { }
class B extends A { }

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        B[] array_Bs = new B[1];
        array_Bs[0] = new B();

        if (a instanceof Foo) {
            System.out.println("'a' IS-A a Foo directly");
        }
        if (b instanceof A) {
            System.out.println("'b' IS-A a A directly");
        }
        if (b instanceof Foo) {
            System.out.println("'b' IS-A a Foo indirectly");
        }
        if (array_Bs[0] instanceof Foo) {
            System.out.println("'array_Bs[0]' IS-A a Foo indirectly");
        }
    }
}