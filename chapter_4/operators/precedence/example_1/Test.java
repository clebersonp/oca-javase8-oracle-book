/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        /*
            Para não ser muito confuso pode usar () que dá precedencia sobre as outras operações;
            quando existem duas operacoes de maior precedencia, será avaliado da esquerda para direita;
            quando existirem conjunto de () mais internos, os mais internos serão avaliados primeiro
        */
        System.out.println(true & false == false || true);

        System.out.println((-7 -4) + " " + (-(7 - 4)));

        System.out.println((2 + 3 * 4) + " " + ((2 + 3) * 4));

        System.out.println(7 > 5 && 2 > 3);

        System.out.print((true & false == false || true) + " ");
        System.out.println(((true & false) == (false | true)));


        /*
            Maior precedencia para o menor, UMARELSA:

            U - unary: -, !, ++, --
            M - multiplication, division, modulus: *, /, %
            A - addition, subtraction: +, -
            R - relational: <, >, <=, >=
            E - equality: ==, !=
            L - logical: &, |
            S - short-circuit: &&, ||
            A - assignment: =, +=, -=
        
        */
    }
}