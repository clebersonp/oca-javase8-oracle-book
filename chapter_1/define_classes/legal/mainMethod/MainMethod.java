package legal.mainMethod;

/*

Variações da assinatura do metodo main:
    public static void main(String[] args) {}
    public static void main(String... args) {}
    static public void main(String[] args) {}
    public static void main(String... listOfArguments) {}
    public static void main(String args[]) {}

    main method pode ser overloading. Se difere por ter o mesmo nome mas com tipos e quantidades de parametros diferentes

*/

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("Main Method invoked by JVM");
    }
}
