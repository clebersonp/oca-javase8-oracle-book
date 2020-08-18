/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {

    /*
        Quando não tem try catch para exceptions, a exceptions é lançada na stack e
        será propagada por toda stack, até encontrar um try catch ou finalizar todos metodos da stack(metodo main)


        Para o exame, pode ser usadas as classes Exception, Error, RuntimeException e Throwable para lançar exception
        Throwable eh a pais de todas as exceptions e errors, e prove diversos metodos como getMessage(), printStackTrace etc.



                                            Object
                                              |
                                              |
                                           Throwable
                                              /\
                                             /  \
                                            /    \
                                           /      \
                                          /        \
                                        Error    Exception
                                                        \
                                                         \
                                                          \
                                                           \
                                                     RuntimeException



        Tecnicamente, Error não eh exception, mas eh lançada por errors que podem ocorrer na JVM
        Exception filhas de Exception ou a exception Throwable, com exceção de RuntimeException, são consideradas checked exceptions,
        todas exceptions filhas de RuntimeException e Error são consideradas exceptions especiais pois são
        consideradas unchecked exceptions e não precisam ser tratadas.

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
        throw new Error("Propagando Error subtype of Throwable na stack de execução");
    }
}