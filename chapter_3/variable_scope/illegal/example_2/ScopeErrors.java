/*
Compilar dentro do diretorio example_2: javac ScopeErrors.java
*/

package example_2;

public class ScopeErrors {
    public static void main(String[] args) {
        ScopeErrors s = new ScopeErrors();
        s.go();
    }

    void go() {
        int y = 5;
        go2();
        y++;                    // variavel local vive enquanto o metodo go() estiver na stack
    }

    void go2() {
        /* não compila, y eh variavel local somente do metodo go(),
            neste momento a variavel y ainda esta viva porem esta
            inacessivel pois a stack esta executando o metodo go2()
            neste momento. Quando o metodo go2() sair da stack,
            volta para stack o processamento do metodo go()
        */
        y++;
    }
}