/*
Compilar dentro do diretorio example_4: javac Test.java
Executar dentro do diretorio example_4: java -cp ../ example_4.Test
*/

package example_4;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
            Array: declarar, construir e inicializar tudo na mesma linha;    
        */

        Dog puppy = new Dog("Frodo");
        Dog[] myDogs = {puppy, new Dog("Clover"), new Dog("Aiko")};
        // constroi 4 objetos na memoria heap
        
        System.out.println(Arrays.deepToString(myDogs));



        // Multidimensional
        int [][] scores = {{5, 2, 4, 7}, {9, 2}, {3, 4, 8}};
        // constroi 4 objetos na memoria heap
        System.out.println(Arrays.deepToString(scores));
    }
}

class Dog {

    private String name;

    public Dog() {}
    public Dog(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("( name: ");
        sb.append(this.name);
        sb.append(" )");
        return sb.toString();
    }
}