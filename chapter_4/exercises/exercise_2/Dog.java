/*
Compilar dentro do diretorio exercise_2: javac Dog.java 
Executar dentro do diretorio exercise_2: java -cp ../ exercise_2.Dog
*/

package exercise_2;

public class Dog {
    String name;
    Dog(String s) { name = s; }
    public static void main(String[] args) {
       Dog d1 = new Dog("Boi");
       Dog d2 = new Dog("Tyri");
       System.out.print((d1 == d2) + " ");
       Dog d3 = new Dog("Boi");
       d2 = d1;
       System.out.print((d1 == d2) + " ");
       System.out.print((d1 == d3) + " ");
    }

    // Result: C. -> false true false
}