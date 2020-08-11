/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

public class Test {
    public static void main(String[] args) {

        String a = "String";
        int b = 3;
        int c = 7;
        /*
            quando usado o operado + com numeros e strings, será usado como concatenação
        */
        System.out.println(a + b + c);
        System.out.println("" + b + c);

        /*
            quando usado o operador + somente com numeros, será utilizado operador de soma,
            o mesmo para outros tipos de operadores aritmeticos
        */
        System.out.println(seven() + 7);
        System.out.println(b + 3);

        /*
            quando usado () para mudar a precedencia de execução, neste caso,
            será realizada primeira a adição para depois a concatenação
        */
        System.out.println(a + (b + c));

        // Operador += com strings será utilizado para concatenação
        String s = "123";
        s += "45";
        s += "67";
        System.out.println(s);

    }
    public static int seven(){
        return 7;
    }
}