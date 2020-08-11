/*
    Compilar dentro do diretorio example_1: javac B.java
    Executar dentro do diretorio example_1: java -cp ../ example_2.B
*/

package example_2;

class A { }
public class B extends A {
    public static void main(String[] args) {
        A myA = new B();
        m2(myA);

        A a = new A();
        m2(a);

        /*
            instanceof pode ser feito o teste  com qualque superclass do tipo do objeto a ser validado
        */
        B b = new B();
        if (b instanceof Object) {
            System.out.println("b is definitely an object");
        }

        int [] nums = new int[3];
        if (nums instanceof Object) {
            System.out.println("array int 'nums' is definitely an object");
        }
    }
    public static void m2(A a) {
        if (a instanceof B) {
            ((B)a).doBStuff();
        } else {
            System.out.println("'a' do not refers do a B");
        }
    }
    public static void doBStuff() {
        System.out.println("'a' refers to a B");
    }
}