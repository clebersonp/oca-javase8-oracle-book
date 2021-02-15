/*
Compilar dentro do diretorio exercise_3: /usr/lib/jvm/jdk1.8.0_221/bin/javac _.java
Executar dentro do diretorio exercise_3: java -cp ../ exercise_3._
*/

package exercise_3;

import static java.lang.System.*;

public class _ {
    static public void main(String[] __A_V_) {
        String $ = "";
        for (int x = 0; ++x < __A_V_.length; )   // for loop
            $ += __A_V_[x];
        out.println($);
    }
    
    // And the command line: java _ - A .
    // Result:
    // B.    -> A.
}