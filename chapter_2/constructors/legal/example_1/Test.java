/*
Compilar dentro do diretorio example_1: javac Test.java
*/

package example_1;

class Foo {

    /* 
        Se eu não adicionar nenum constructor, o compilador adiciona sempre um construtor default.
        Caso eu crie o meu proprio construtor, que seja diferente do construtor default, o compilador
        não adicionar um construtor default, neste caso eu preciso cria-lo
    */
    Foo() {} // the default constructor
}