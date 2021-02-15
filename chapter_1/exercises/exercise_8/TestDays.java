/*
Compilar dentro do diretorio exercise_8: javac TestDays.java
Executar dentro do diretorio exercise_8: java -cp ../ exercise_8.TestDays
*/

package exercise_8;

public class TestDays {
    public enum Days { MON, TUE, WED };
    static public void main(String[] args) {
        for(Days d : Days.values() )
            ;
        Days [] d2 = Days.values();
        System.out.println(d2[2]);
    }
    
    // Result:
    // B.    -> WED
}