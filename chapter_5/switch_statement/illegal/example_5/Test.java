/*
Compilar dentro do diretorio example_5: javac Test.java
Executar dentro do diretorio example_5: java -cp ../ example_5.Test
*/

package example_5;

public class Test {
    public static void main(String[] args) {
        
        /*
            Não compila, pois ao o compilador sabe que o argumento eh passado um char,
            porem as constants dos 'case' eh do tipo char e integer e por isso se tiver estouro,
            precisaria realizar um cast explicito nos 'case' para assumir a possivel perda
            e ser compativel com o tipo passado no argumento do switch;
        */
        char c = 'c';
        switch(c) {
            case 'a':
            case 'b':
            case 99: System.out.println(((Object)c).getClass().getName() + " " + (int)c);
            case 65556: // não compila: Test.java:34: error: incompatible types: possible lossy conversion from int to char
        }
        
    }
}