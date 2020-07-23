/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.util.Objects;

class LeadRope {
    public void pull() {
        System.out.println("Pulling the Lead Rope");
    }
}

class Animal {}

class Horse extends Animal {

    // a Horse HAS-A instance variable of Halter
    private Halter myHalter = new Halter();
    public void tie(LeadRope rope) {
        myHalter.tie(rope);
    }
}

class Halter {
    public void tie(LeadRope rope) {
        if (Objects.nonNull(rope)) {
            rope.pull();
        } else {
            System.out.println("Doing nothing.....");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.tie(new LeadRope());
    }
}