/*
Compilar dentro do diretorio example_8: javac Test.java
Executar dentro do diretorio example_8: java -cp ../ example_8.Test
*/

package example_8;

public class Test {
    public static void main(String[] args) {
        
        boolean trueInt = false;
        boolean falseInt = false;
        
        /*
            Cuidado com pegadinhas:
            Esta ocorrendo atribuição ao inves de comparar usando o comparador ==;
            Não tem erro de compilação pois os valores atribuidos ainda resultam em boolean
        */

        System.out.println(String.format("Valores iniciais de trueInt = %s e falseInt = %s", trueInt, falseInt));

        if (trueInt = true)
        System.out.println(String.format("trueInt = %s", trueInt));
        if (falseInt = true)
        System.out.println(String.format("falseInt = %s", falseInt));



        /*
            Estrutura equivalente a:
            
            if (trueInt = true) {
                System.out.println(String.format("trueInt = %s", trueInt));
            }
            if (falseInt = true) {
                System.out.println(String.format("falseInt = %s", falseInt));
            }


        */
    }
}