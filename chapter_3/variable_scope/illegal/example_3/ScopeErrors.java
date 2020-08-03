/*
Compilar dentro do diretorio example_3: javac ScopeErrors.java
*/

package example_3;

public class ScopeErrors {
    public static void main(String[] args) {
        ScopeErrors s = new ScopeErrors();
        s.go();
    }

    void go() {
        for (int z = 0; z < 5; z++) {
            boolean test = false;
            if (z == 3) {
                test = true;
                break;
            }
        }

        /*
            Não compila, o escopo da variavel test eh somente dentro do block do for;
            Outros tipos de blocos: init blocks, for, do, while, switches, try-catch, ifs, else
        */
        System.out.println(String.format("Tentando acessar variavel de bloco fora do bloco. test: %s", test));
    }

}