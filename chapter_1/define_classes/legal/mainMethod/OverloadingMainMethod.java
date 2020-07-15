package legal.mainMethod;

/*

    O que realmente importa para overloading de methods é ter o mesmo nome e diferenciar pela quantidade, tipo e posição dos parametros.

*/

public class OverloadingMainMethod {

    public static final String OVERLOADING_MAIN_METHOD = "Normal Main Method without super power. Overloading";

    public static void main(String[] args) {
        System.out.println("Main Method with real Power. Entry Point");

        OverloadingMainMethod o = new OverloadingMainMethod();
        o.main(10, 10, args);
        o.main(args, 15, 15);
        o.main(20, args, 20);

        OverloadingMainMethod.main();
        OverloadingMainMethod.main("Text right here");
        OverloadingMainMethod.main(50, args);
        OverloadingMainMethod.main(args, 60);
        OverloadingMainMethod.main("Some text_1", args);
        OverloadingMainMethod.main(args, "Some text_2");
    }

    static public void main(String text) {
        System.out.println(OVERLOADING_MAIN_METHOD + " -> text: " + text);
    }

    static public void main() {
        System.out.println(OVERLOADING_MAIN_METHOD + " -> do nothing");
    }

    static public void main(int x, String... arguments) {
        System.out.println(OVERLOADING_MAIN_METHOD + " -> x: " + x);
    }

    static public void main(String[] arguments, int x) {
        System.out.println(OVERLOADING_MAIN_METHOD + " -> x: " + x);
    }

    public int main(int x, int y, String args[]) {
        int result = x + y;
        System.out.println(OVERLOADING_MAIN_METHOD + " -> result: " + result);
        return result;
    }

    public int main(String args[], int x, int y) {
        int result = x + y;
        System.out.println(OVERLOADING_MAIN_METHOD + " -> result: " + result);
        return result;
    }

    public int main(int x, String args[], int y) {
        int result = x + y;
        System.out.println(OVERLOADING_MAIN_METHOD + " -> result: " + result);
        return result;
    }

    static String main(String value, String... args) {
        System.out.println(OVERLOADING_MAIN_METHOD + " -> value: " + value);
        return value;
    }

    public static String main(String[] args, String value) {
        System.out.println(OVERLOADING_MAIN_METHOD + " -> value: " + value);
        return value;
    }
}