/*
Compilar dentro do diretorio illegal: javac Foo.java
*/

package illegal;

public class Foo {

    // Todos construtores são illegals
    void Foo() {} // não é construtor é metodo pois tem tipo de retorno
    Foo2() {} // não é um construtor e nem um metodo pois tem nome diferente da class e se for metodo falto retorno
    Foo(int x); // parece ser um construtor abstract, o que não é aceito pois não pode ser override
    static Foo(byte b) {} // construtor static não é aceito, pois o construtor é necessario para instanciar objetos
    final Foo(long a) {} // construtor final não é aceito pois construtores não podem ser override
    abstract Foo(double d) {} // construtor abstract não é permitido
    Foo(int... y, int x) {} // só é permitido varargs como ultimo parametro

    // NÂO COMPILA
    public static void main(String[] args) {
        Foo foo = new Foo(1, 2, 3, 4); // contrutor int... y e int x
        System.out.println(foo);
    }
}