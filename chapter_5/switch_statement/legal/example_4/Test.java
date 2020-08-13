/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

public class Test {
    
    enum Color { RED, BLUE, GREEN, BLACK}
    
    public static void main(String[] args) {
        
        byte g = -128;
        
        /*
            Neste caso precisou fazer o cast para byte os valores dos 'case' pois o argumento do switch
            eh passado um byte
        */
        switch(g) {
            case (byte)23:
            case (byte)128: System.out.println(((Object)g).getClass().getName());
        }

        // convertendo para int o argumento do switch pois as constants dos 'case' são inteiros
        int x = (int)g;
        switch(x) {
            case 23:
            case -128: System.out.println(((Object)x).getClass().getName());
        }

        char c = 'c';
        switch(c) {
            case 'a':
            case 'b':
            case 99: System.out.println(((Object)c).getClass().getName() + " " + (int)c);
            case 65535:
        }

        short s = 10;
        switch(s) {
            case 1:
            case (short)32768:
            case 10: System.out.println(((Object)s).getClass().getName());
        }

        int i = 15;
        switch(i) {
            case 1:
            case (int)4294967296L:
            case 15: System.out.println(((Object)i).getClass().getName());
        }
        
        /*
            constants enum nos 'case' deve usar o valor da constant sem informar o tipo.valor
        */
        Color color = Color.RED;
        switch(color) {
            case BLUE:
            case GREEN:
            case BLACK:
            case RED: System.out.println(color.getClass().getName() + " isEnum? " + color.getClass().isEnum());
        }

        String name = "abc";
        switch(name) {
            case "Abc":
            case "aBc":
            case "ABC":
            case "abc": System.out.println(((Object)name).getClass().getName() + " sensitive case");
        }

    }
}