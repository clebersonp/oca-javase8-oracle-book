/*
Compilar dentro do diretorio example_10: javac Test.java
Executar dentro do diretorio example_10: java -cp ../ example_10.Test
*/

package example_10;

/*
    As 10 mais comuns exceptions e errors

    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | Classe                                      |    -> Descrição do uso                                                          |       -> Quem lança                 |          -> Extends from               |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.ArrayIndexOutOfBoundsException    |    -> tenta acessar um indice invalido de um array                              |       -> JVM                        |          -> java.lang.RuntimeException |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.ClassCastException                |    -> tenta fazer o cast quando falha no teste IS-A                             |       -> JVM                        |          -> java.lang.RuntimeException |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.IllegalArgumentException          |    -> passado um argumento do metodo invalido                                   |       -> Programaticamente          |          -> java.lang.RuntimeException |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.IllegalStateException             |    -> quando a aplicação não está em um estado apropriado para a requisição     |       -> Programaticamente          |          -> java.lang.RuntimeException |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.NullPointerException              |    -> quando tenta acessar um membro do objeto e a referencia eh nula           |       -> JVM                        |          -> java.lang.RuntimeException |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.NumberFormatException             |    -> quando tenta fazer a conversão de uma string para um numero               |       -> Programaticamente          |          -> java.lang.RuntimeException |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.ArithmeticException               |    -> quando uma operação aritmetica invalida ocorrer                           |       -> JVM                        |          -> java.lang.RuntimeException |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.ExceptionInInitializerError       |    -> quando uma exception ocorre na inicialização static                       |       -> JVM                        |          -> java.lang.Error            |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.StackOverflowError                |    -> quando ocorre um estouro da pilha(stack na memoria)                       |       -> JVM                        |          -> java.lang.Error            |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|
    | java.lang.NoClassDefFoundError              |    -> quando a JVM não consegue uma classe necessaria                           |       -> JVM                        |          -> java.lang.Error            |
    |---------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------|----------------------------------------|

*/

public class Test {
    public static void main(String [] args) {
        System.out.println("Nothing special....");
    }
}