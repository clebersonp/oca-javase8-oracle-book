/*
Para compilar dentro do diretorio defaultMethods; javac -cp ../ InterfaceDefaultMethodsImpl.java
Para executar dentro do diretorio defaultMethods; java -cp ../ defaultMethods.InterfaceDefaultMethodsImpl
*/

package defaultMethods;

/*
Implementa uma interface com default methods
*/
public class InterfaceDefaultMethodsImpl implements InterfaceDefaultMethods {
    public static void main(String[] args) {
        InterfaceDefaultMethods interfaceImpl = new InterfaceDefaultMethodsImpl();
        System.out.println(interfaceImpl.sum(5, 5));
        System.out.println(interfaceImpl.sum(5, 5, 5));
    }
}