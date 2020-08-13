/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        final int a = 1;
        final int b;
        int c = 3;
        b = 2;
        int x = 0;

        /*
            as variaveis nos 'case' precisam ser constants, e significa, que ao usar variaveis
            elas precisam ser constants e precisam ser declaradas como final e inicializadas na mesma linha
        */
        switch(x) {
            case a: // OK
            case b: // não compila, por mais que seja final, precisa ser declarado e inicializada na mesma instrução(linha); Test.java:23: error: constant expression required
            case c: // não compila, por mais que a variavel c foi declarada e atribuido valor na mesma linha, tbm precisa ser final, ou seja, constant: Test.java:24: error: constant expression required
        }
        
    }
}