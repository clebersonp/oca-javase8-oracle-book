/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {

    /*
        Quando não tem try catch para exceptions, a exceptions é lançada na stack e
        será propagada por toda stack, até encontrar um try catch ou finalizar todos metodos da stack(metodo main)
    */

    public static void main(String[] args) {
        Test.a();
    }

    public static void a() {
        Test.b();
    }

    public static void b() {
        Test.c();
    }

    public static void c() {
        Test.d();
    }

    public static void d() {
        Test.e();
    }

    public static void e() {
        Test.f();
    }

    public static void f() {
        Test.g();
    }

    public static void g() {
        Test.h();
    }

    public static void h() {
        Test.i();
    }

    public static void i() {
        Test.j();
    }

    public static void j() {
        throw new RuntimeException("Propagando RuntimeException na stack de execução");
    }
}