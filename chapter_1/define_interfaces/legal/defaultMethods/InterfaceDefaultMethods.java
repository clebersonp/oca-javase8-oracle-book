/*
A partir do java 8 foi introduzido default methods em interfaces utilizando a keyword default;
A keyword só pode ser usada em interface's methods, não pode ser usado para classes;
Default methods são considerados methods public por definição, então é redundante usar a keyword public;
Default methods não podem ser marcados pelas keywords private, protected, static, final ou abstract;
Defaul methods são concretos, ou seja, precisam de implementação e terminam com }
*/

package defaultMethods;

public interface InterfaceDefaultMethods {
    String DEFAULT_MSG = "Executando default interface methods";

    default int sum(int x, int y) {
        System.out.println(InterfaceDefaultMethods.DEFAULT_MSG);
        return x + y;
    }

    public default int sum(int x, int y, int z) {
        return this.sum(x, y) + z;
    }
}