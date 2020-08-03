/*
Compilar dentro do diretorio example_1: javac Foo.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Foo
*/


package example_1;

class Bar {
    int barNum = 28;
}
/*

                                            Primeiro Passo:

                                        example_1.Bar@4554617c
                        f.myBar -----------------------------------> Bar.barNum = 28




                                Segundo Passo ao invocar o metodo changeIt()(stack)

                                        example_1.Bar@4554617c
                        f.myBar -----------------------------------> Bar.barNum = 99
                                                                  /
                                        example_1.Bar@4554617c   /
                        myBar ----------------------------------/




                                Terceiro Passo myBar local(stack) recebendo nova instance de objeto

                                        example_1.Bar@4554617c
                        f.myBar -----------------------------------> Bar.barNum = 99
                                                                  
                                        example_1.Bar@7891005d                                                                 
                        myBar -------------------------------------> Bar.barNum = 420



                         Quarto Passo, myBar local(stack) deixa de apontar para o objeto;

                                        example_1.Bar@4554617c
                        f.myBar -----------------------------------> Bar.barNum = 99
                                                                  
                                                                 
                        myBar = null                                 Bar.barNum = 420 -> Objeto sera destruido pelo Garbage Collection

*/
public class Foo {

    Bar myBar = new Bar();

    // passando a copia(bits) da variavel de referencia(ponteiro) para o metodo changeIt
    void changeIt(Bar myBar) {

        /*
            Shadowy pois o nome do parametro do metodo e a variavel de referencia da class Foo são iguais;
            Para diferenciar uma da outra, deve-se usar a keyword this.myBar para referenciar o objeto de instancia
        */

        myBar.barNum = 99; // neste ponto modifica o mesmo objeto pois 2 ponteiros estão apontando para o mesmo objeto no heap
        System.out.println(String.format("myBar.barNum in changeIt() is '%s'", myBar.barNum));
        
        myBar = new Bar(); // neste ponto myBar deixa de apontar para o objeto anterior e passa a apontar para o novo objeto
        myBar.barNum = 420;
        System.out.println(String.format("myBar.barNum in changeIt() is now '%s'", myBar.barNum));
        
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.println(String.format("f.myBar.barNum is '%s'", f.myBar.barNum));

        // passando a copia(bits) da variavel de referencia(ponteiro) myBar para o metodo changeIt
        f.changeIt(f.myBar);
        System.out.println(String.format("f.myBar.barNum after changeIt() is '%s'", f.myBar.barNum));
    }
}