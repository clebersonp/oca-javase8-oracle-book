/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {

    static int[] x = new int[4];

    /*
        Init blocks podem causar erros em tempo de runtime tambem e o tipo da exception eh java.lang.ExceptionInInitializerError
            Msg: Exception in thread "main" java.lang.ExceptionInInitializerError
                Caused by: java.lang.ArrayIndexOutOfBoundsException: 4
                at example_1.Test.<clinit>(Test.java:18)

                
        Ao tentar acessar um indice que não existe no array static, causa ArrayIndexOutOfBoundsException
    */
    static { x[4] = 5; }


    /*
        Compila, porem não roda, exception causada no static init block
    */
    public static void main(String[] args) {}

}

