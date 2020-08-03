/*
    Compilar dentro do diretorio example_2: javac Test.java
    Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

class Foo {
    private String name;

    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }
}

public class Test {
    static public void main(String [] args) {
        Test t = new Test();

        Foo f = new Foo();
        System.out.println(String.format("Before change: f reference of Foo on heap: %s", f));
        t.doStuff(f);
        System.out.println(String.format("After change: f reference of Foo on heap: %s", f));

        System.out.println(String.format("Foo name is '%s'", f.getName()));
    }

    /*
        Eh realizada a copia da referencia para o metodo, ou seja, duas referencias apontando para o mesmo objeto;



        Primerio Passo: copia da referencia para o metodo:

                    example_2.Foo@4554617c
        f ------------------------------------> Foo: name = null;
                                             /                        
                    example_2.Foo@4554617c  /
        g ---------------------------------/


        Segundo Passo: Alterar variavel de instancia name para "Boo" atraves da variavel g;
        
                    example_2.Foo@4554617c
        f ------------------------------------> Foo: name = "Boo";
                                             /                        
                    example_2.Foo@4554617c  /
        g ---------------------------------/


        Terceiro Passo: Alterar referencia da variavel g para um novo objeto Foo;
        
                    example_2.Foo@4554617c
        f ------------------------------------> Foo: name = "Boo";

                                             
                    example_2.Foo@74a14482
        g ------------------------------------> Foo: name = null;

    */
    void doStuff(Foo g) {
        System.out.println(String.format("Before change: g reference of Foo on heap: %s", g));
        g.setName("Boo");

        /* referencia para um novo objeto não altera o ponteiro
            passado pelo metodo, pois eh passado a copia do ponteiro, ou seja,
            não eh passado o mesmo ponteiro em si, mas uma copia dele
        */
        g = new Foo();
        System.out.println(String.format("After change to new Object of Foo: g reference of Foo on heap: %s", g));
    }

}