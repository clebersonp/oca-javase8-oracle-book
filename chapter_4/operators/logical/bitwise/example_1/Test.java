/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

/*
operadores bitwise não caem no exame:
Operadores bitwise utilizado com tipos primitivos numericos
são eles: & | ^
*/

public class Test {
    public static void main(String[] args) {
        
        /*
            0110 = 6
            1000 = 8
           ------
            0000 = 0
        */
        byte b1 = 6 & 8; // 1 & 1 = 1 caso contrario zero

        /*
            0101 = 7
            1001 = 9
           ------
            1111 = 15
        */
        byte b2 = 7 | 9; // (1 | 1 = 1); (1 | 0 = 1); (0 | 1 = 1) caso contrario zero

        /*
            0101 = 5
            0100 = 8
           ------
            0001 = 1
        */
        byte b3 = 5 ^ 4; // (1 ^ 0 = 1); (0 ^ 1 = 1) caso contrario zero

        System.out.println("b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3);
    }
}