/*
Compilar dentro do diretorio exercise_2: javac Plane.java
Executar dentro do diretorio exercise_2: java -cp ../ exercise_2.Plane
*/

package exercise_2;

public class Plane {
    static String s = "-";
    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(s);
    }
    void s1() {
        try { s2(); }
        catch (Exception e) { s += "c"; }
    }
    void s2() throws Exception {
        s3();   s += "2";
        s3();   s += "2b";
    }
    void s3() throws Exception {
        throw new Exception();
    }
    // Result: -c
}