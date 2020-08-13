/*
Compilar dentro do diretorio example_6: javac Test.java
Executar dentro do diretorio example_6: java -cp ../ example_6.Test
*/

package example_6;

public class Test {
    public static void main(String[] args) {      

        /*
            Fall-through: Quando não existe break para cada case, será validado se o argumento
            passado no switch eh igual a alguma constant dos 'case', caso existir alguma
            igualdade, executara a instrução desse 'case' e de todos os outros 'case' ou 'default'
            até encontrar um 'break' ou o fecha } do switch

            Se quiser que termine a execução assim que fizer match em algum 'case', então
            eh necessário colocar a instrução 'break' para cada 'case'
        */

        String s = "green";
        switch (s) {
            case "red": System.out.print("red ");
            case "green": System.out.print("green ");
            case "blue": System.out.print("blue ");
            case "black": System.out.print("black ");
            default:
                System.out.println("done");
        }

        int x = 1;
        switch (x) {
            case 1: System.out.print("x is one ");
            case 2: System.out.print("x is two ");
            case 3: System.out.print("x is three ");
        }
        System.out.println("out of the switch");


        /*
            Comportamento adequado de uma estrutura switch-case
        */
        int y = 1;
        switch (y) {
            case 1: { 
                System.out.println("x is one "); break;
            }
            case 2: {
                System.out.println("x is two "); break;
            }
            case 3: {
                System.out.println("x is three "); break;
            }
        }
        System.out.println("out of the switch");


        /*
            Exemplo de Fall down through, qualquer numero par entre 1 até 10 caira em algum 'case', e executara as
            instruções dos outros 'case' que não fazem nada, até executar o 'case' 10 que tem um break;

            O 'default case', será executado caso não ser valida nenhuma outra constant 'case', e sua ordem dentro da
            estrutura do switch pouco importa, ou seja, poderia ser a primeira ou ultima instrução, só será executado
            se nenhum outro 'case' for satisfatorio;
        */
        int numberBetweenOneAndTen = 2;
        switch(numberBetweenOneAndTen) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: {
                System.out.println("number is an even number"); break;
            }
            default: {
                System.out.println("number is an odd number"); break; // break eh opcional pois esse eh a ultima instrução do switch
            }
        }

    }

    public static double complexCalc(int i) {
        return Math.pow(2, i);
    }
}