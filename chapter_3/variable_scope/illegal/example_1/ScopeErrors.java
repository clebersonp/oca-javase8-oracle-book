/*
Compilar dentro do diretorio example_1: javac ScopeErrors.java
*/

package example_1;

public class ScopeErrors {
    int x = 5;
    public static void main(String[] args) {
        x++;            // não compila, x eh uma variavel de instancia e metodos static não podem acessar diretamente, precisa de uma referencia do objeto
    }
}