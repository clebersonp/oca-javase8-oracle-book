package legal.mainMethod;

/*
    O que realmente importa para overloading de methods é ter o mesmo nome e diferenciar pela quantidade, tipo e posição dos parametros.
*/

// não compila, duplicidade de metodos
public class OverloadingMainMethod {

    public static void main(String[] args) {
        System.out.println("Main Method with real Power. Entry Point");
    }
    static public void main(String[] args) {
        System.out.println("Main Method with real Power. Entry Point");
    }
}