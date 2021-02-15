/*
Compilar dentro do diretorio exercise_4: javac TestEnum.java
Executar dentro do diretorio exercise_4: java -cp ../ exercise_4.TestEnum
*/

package exercise_4;

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals (String s) { sound = s; }
}

public class TestEnum {
    static Animals a;
    static public void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
    
    // Result:
    // A.    -> woof burble
}