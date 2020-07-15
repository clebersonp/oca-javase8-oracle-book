/*
Para compilar no diretorio defaultMethods: javac -cp ../ InterfaceDefaultMethods.java
*/

/*
A partir do java 8 foi introduzido default methods em interfaces utilizando a keyword default;
A keyword só pode ser usada em interface's methods, não pode ser usado para classes;
Default methods são considerados methods public por definição, então é redundante usar a keyword public;
Default methods não podem ser marcados pelas keywords private, protected, static, final ou abstract;
Defaul methods são concretos, ou seja, precisam de implementação e terminam com }
*/

package defaultMethods;

// Não compila por diversos error na definição dos default methods
public interface InterfaceDefaultMethods {
    String DEFAULT_MSG = "Executando default interface methods";

    protected default int sum(int x, int y) { // não pode usar keyword protected
        System.out.println(InterfaceDefaultMethods.DEFAULT_MSG);
        return x + y;
    }

    public final default int sum(int x, int y, int z) { // não pode usar keyword final
        return this.sum(x, y) + z;
    }

    public static default int sum(int x, int y, int z, int a) { // não pode usar keyword static
        return x + y + z + a;
    }

    default int minus(int x, int y); // default methods precisa ser concreto

    abstract default int minus(int x, int y, int z); // não pode usar keyword abstract
}