/*
Compilar dentro do diretorio exercise_11: javac Test.java
Executar dentro do diretorio exercise_11: java -cp ../ exercise_11.Test
*/

package exercise_11;

public class Test {
    public static void main(String[] args) {

        boolean b1 = false;
        boolean b2;
        int x = 2, y = 5;
        b1 = 2-12/4 > 5+-7 && b1 != y++>5 == 7%4 > ++x | b1 == true;
        b2 = (2-12/4 > 5+-7) && (b1 != y++>5) == (7%4 > ++x) | (b1 == true);

        System.out.println(b1 + " " + b2);

        /*  

            Seguindo a ordem de precedencia: () e UMARELSA

            // b1 = false, x = 2, y = 5       
            b1 = 2-12/4 > 5+-7 && b1 != y++>5 == 7%4 > ++x | b1 == true; // x = 3
            b1 = 2-12/4 > 5+-7 && b1 != y++>5 == 7%4 > 3 | b1 == true;
            b1 = 2-3 > 5-7 && b1 != y++>5 == 3 > 3 | b1 == true;
            b1 = -1 > -2 && b1 != y++>5 == 3 > 3 | b1 == true; // y = 5
            b1 = true && b1 != false == false | b1 == true; // y = 6
            b1 = true && false != false == false | false == true;
            b1 = false != false == false | false == true;
            b1 = false == false | false == true;
            b1 = true | false == true;
            b1 = true | false;
            b1 = true
        
            // b1 = true, y = 6, x = 3
            b2 = (2-12/4 > 5+-7) && (b1 != y++>5) == (7%4 > ++x) | (b1 == true); // x = 4
            b2 = (2-3 > 5+-7) && (false != y++>5) == (3 > 4) | (true == true); // y = 6
            b2 = (-1 > -2) && (false != true) == (false) | true; // y = 7
            b2 = true && true == (false) | true;
            b2 = true == (false) | true;
            b2 = false | true;
            b2 = true;
        */
    }

    // Result: A. - > true true
}