/*
Compilar dentro do diretorio example_2: javac GuessAnimal.java
Executar dentro do diretorio example_2: java -cp ../ example_1.GuessAnimal
*/

package example_2;

public class GuessAnimal {
    public static void main(String[] args) {

        String animal = "unknown";
        int weight = 700;
        char sex = 'm';
        double coloWaveLength = 1.630;
        if (weight >= 500) { animal = "elephant"; }
        if (coloWaveLength >= 1.621) { animal = "gray " + animal; }
        if (sex <= 'f') { animal = "female " + animal; }
        System.out.println("The animal is a " + animal);

        /*
            Java usa valores unicode para comparar entre caracteres,
            char = 16bytes sem sinal; 2 ^ 16 - 1 = 65535
        */
        char a = 'm';
        char b = 'f';
        int a_int = a;
        int b_int = b;
        System.out.println(String.format("char a = %s, char b = %s", a, b));
        System.out.println(String.format("char %s == int %s? %s", a, a_int, a == a_int));
        System.out.println(String.format("char %s == int %s? %s", b, b_int, b == b_int));

        // MAX_VALUE
        char max_int = 65535;
        char max_unicode = '\uFFFF';
        System.out.println(String.format("MAX_INT CHAR: %s", max_int));
        System.out.println(String.format("MAX_UNICODE CHAR: %s", max_unicode));
        System.out.println(String.format("MAX_INT %s == MAX_UNICODE %s? %s", max_int, max_unicode, max_int == max_unicode));
    }
}