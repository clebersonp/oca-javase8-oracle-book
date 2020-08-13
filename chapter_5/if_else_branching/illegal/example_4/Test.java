/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

public class Test {
    public static void main(String[] args) {
        
        int trueInt = 1;
        int falseInt = 0;
        
        /*
            Cuidado com pegadinhas, ao inves de comparar usando o operador ==, está sendo feita a atribuição
            dos valores para as variaveis no momento da validação da expressão dentro dos ifs.
            Se as variaveis fossem boolean e fosse atribuido boolean, tambem seria atribuição porem o resultado
            final ainda seria um boolean
        */

        if (trueInt = 1)
        System.out.println("trueInt = 1");
        if (falseInt = 0)
        System.out.println("falseInt = 0");
    }
}