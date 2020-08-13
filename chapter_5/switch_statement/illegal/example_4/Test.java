/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

public class Test {
    public static void main(String[] args) {
        
        byte g = 2;
        
        /*
            Não compila, pois ao o compilador sabe que o argumento eh passado um byte,
            porem as constants dos 'case' eh do tipo integer e pois isso se tiver estouro,
            precisaria realizar um cast explicito nos 'case' para assumir a possivel perda
            e ser compativel com o tipo passado no argumento do switch;
        */
        switch(g) {
            case 23:
            case 128: // não compila: Test.java:21: error: incompatible types: possible lossy conversion from int to byte
        }
        
    }
}