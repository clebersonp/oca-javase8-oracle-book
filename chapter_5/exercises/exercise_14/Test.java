/*
Compilar dentro do diretorio exercise_14: javac Test.java
Executar dentro do diretorio exercise_14: java -cp ../ exercise_14.Test
*/

package exercise_14;

public class Test {
    public static void main(String[] args) {
        String s = "bob";
        String[] sa = {"a", "bob"};
        final String s2 = "bob";
        StringBuilder sb = new StringBuilder("bob");

        // switch(sa[1]) {          // line 1
        // switch("b" + "ob") {     // line 2
        // switch(sb.toString()) {  // line 3

        // case "ann":  ;            // line 4
        // case s:      ;            // line 5
        // case s2:     ;            // line 6
        // }
    }

    /*
        And given tha the numbered lines will all be tested by uncommenting one switch statement
        and one case statement together, which line(s) will FAIL to compile?
    */

    // Result: E. -> line 5
}



