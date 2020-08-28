/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String [] args) {

        /*
            ArrayList só aceito o tipo que foi declarado no <>, ou subtipo quando houver IS-A via heranca ou interface
            ArrayList só aceita tipos de objeto, não aceita tipos primitivos,
                mais existe o autoboxing do tipo primitivo para a classe Wrapper correspondente
        */

        // declarando de forma polimorfica, pois ArrayList implements List
        List<String> cities = new ArrayList<>();
        cities.add("Rome");
        cities.add("Naples");
        cities.add("Rome"); // ArrayList permite duplicacao

        System.out.println(cities); // println invoca o metodo toString de ArrayList

        // ArrayList so aceita tipos wrappers quando trabalhados com tipos primitivos.
        List<Integer> numbers = new ArrayList<>();
        // será feito o autoboxing do tipo primitivo int para a classe wrapper Integer
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);

        System.out.println(numbers);

        List<String> myList = new ArrayList<String>();

        myList.add("z");
        myList.add("x");
        myList.add(1, "y");
        myList.add(0, "w");
        System.out.println(myList);

        myList.clear(); // remove tudo
        myList.add("b");
        myList.add("a");
        myList.add("c");
        System.out.println(myList);
        System.out.println(myList.contains("a") + " " + myList.contains("x"));

        System.out.println("get 1: " + myList.get(1)); // Throws: IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
        System.out.println("index of c: " + myList.indexOf("c"));
        System.out.println("index of f: " + myList.indexOf("f")); // -1 if this list does not contain the element

        myList.remove(1); // Throws: IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
        myList.remove("b"); // Returns: true if this list contained the specified element

        /*
            Arrays possui o atributo length;
            String possui o metodo length();
            ArrayList possui o metodo size();
        */
        System.out.println("size: " + myList.size() + " contents: " + myList); // Returns the number of elements in this list.
    }
}