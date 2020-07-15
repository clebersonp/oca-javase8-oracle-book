/*
Para compilar dentro do diretorio staticMethods: javac -cp ../ StaticInterfaceImpl.java
Para executar dentro do diretorio staticMethods: java -cp ../ staticMethods.StaticInterfaceImpl
*/
package staticMethods;

public class StaticInterfaceImpl implements StaticInterface {
    public static void main(String[] args) {
        
        // Acessando static interface methods de maneira static
        System.out.println(StaticInterface.sum(5, 5));
        StaticInterface.doNothing();
    }
}