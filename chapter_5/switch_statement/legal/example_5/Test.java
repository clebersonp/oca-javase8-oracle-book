/*
Compilar dentro do diretorio example_5: javac Test.java
Executar dentro do diretorio example_5: java -cp ../ example_5.Test
*/

package example_5;

public class Test {
    public static void main(String[] args) {      

        int x = 3;
        switch (x) {
            case 1:
                System.out.println("length is one");
                break;
            case 2:
                System.out.println("length is two");
                break;
            case 3: 
                /* essa estrutura eh valida, ainda o break poderia se colocado dentro das {}
                    se não colocar o break dentro ou fora do {}, será executado a proxima instrução
                    dos proximos 'case' até encontrar um break ou } do switch
                */
                {
                    System.out.println("length is three");
                    System.out.println("now will be calc the pow of 2^x");
                    System.out.println(String.format("now value is %s", complexCalc(x)));
                }
                break;
            default:
                System.out.println("length is one");
        }
    }

    public static double complexCalc(int i) {
        return Math.pow(2, i);
    }
}