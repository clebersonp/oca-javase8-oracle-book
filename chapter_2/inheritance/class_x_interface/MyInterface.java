package class_x_interface;

// não existe construtor em interface
// não existe init blocks em interfaces
public interface MyInterface {

    // não existe variavel static em interface
    // são consideradas Constantes
    // e são herdadas
    static double PI = 3.1415;

    // metodos statics de interface não são herdados, são acessados somente
    static void print() {
        System.out.println(String.format("Printing from %s static method", "MyInterface"));
    }

    // default methods são herdados pelas subclasses ou classes implementadoras
    default void printing(String value) {
        System.out.println(String.format("Printing the value '%s' from %s's default method", value, "MyInterface"));
    }

    // abstract methods são herdados subclasses ou classes implementadoras e precisam de implementação(concrete)
    int sum(int x, int y);

}