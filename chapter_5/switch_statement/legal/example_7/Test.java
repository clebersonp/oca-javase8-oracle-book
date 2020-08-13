/*
Compilar dentro do diretorio example_7: javac Test.java
Executar dentro do diretorio example_7: java -cp ../ example_7.Test
*/

package example_7;

public class Test {
    public static void main(String[] args) {      

        /*
            Fall down-through: tambem se aplica para o 'default case' se não tiver break;
            'default case' pode ir em qualquer posição dentro da estrutura do switch,
            não precisa ser o ultimo.
            Caso o 'default' seja o ultimo 'case', não eh obrigatorio usar break, por
            se tratar de ser a ultima instrução antes do fecha } switch;
            Caso o 'default' não seja o ultimo, se não quiser o comportamento fall down through,
            deve usar a instrução 'break';
            Contando que todos 'case' tenham a instrução 'break': 'default case' será
            executado somente se nenhum dos outros 'case' forem satisfeitos a condicional,
            independente de sua posição dentro do switch;

        */

        // fall down through com default em outra posição
        int x = 2;
        switch (x) {
            case 2: System.out.println("2");
            default: System.out.println("default");
            case 3: System.out.println("3");
            case 4: System.out.println("4");
        }

        System.out.println("\n=======================\n");

        // fall down through a partir do default em outra posição
        int y = 7;
        switch (y) {
            case 2: System.out.println("2");
            default: System.out.println("default");
            case 3: System.out.println("3");
            case 4: System.out.println("4");
        }

        System.out.println("\n=======================\n");


        // default com break em outra posição
        int a = 7;
        switch (a) {
            default: System.out.println("default"); break;
            case 2: System.out.println("2");
            case 3: System.out.println("3");
            case 4: System.out.println("4");
        }
    }
}