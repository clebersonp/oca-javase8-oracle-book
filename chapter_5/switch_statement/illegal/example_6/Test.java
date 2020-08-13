/*
Compilar dentro do diretorio example_6: javac Test.java
Executar dentro do diretorio example_6: java -cp ../ example_6.Test
*/

package example_6;

public class Test {
    public static void main(String[] args) {
        
        byte g = 2;
        
        /*
            Não compila, pois o compilador testa se o argumento passado pode ser convertido para um int implicitamente,
            porem ocorrea um estouro e o compilador avisa para realizar o cast explicito ao passar o argumento do switch
        */
        
        long l = 15L;
        switch(l) { // não compila: Test.java:19: error: incompatible types: possible lossy conversion from long to int
            case 1L:
            case 10L:
            case 15L:
        }
    }
}