/*
Compilar dentro do diretorio example_1: javac Dog.java
*/

package example_1;

class Cat { }
public class Dog {
    public static void main(String[] args) {
        Dog d = new Dog();

        /*
            Erro de compilação pois um Dog não pode ser convertido em um Cat, não possuem IS-A referencia.
            instanceof só pode ser usado para instancias de objeto que tenham relação IS-A com o tipo do lado direito,
            ou seja, somente para tipos que podem ser convertidos para o tipo do lado direito;
        */
        System.out.println(d instanceof Cat);
    }
}