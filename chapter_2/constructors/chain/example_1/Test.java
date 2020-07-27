/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

package example_1;

class Animal {

    /*
        Desde que não tenha chamadas de construtores overloads(this()), o compilador
        adiciona por padrão a instrução super(), chamando o construtor da superclass(Object)
    */
    Animal() {
        super();
    }
}

class Horse extends Animal {

    /*
        Desde que não tenha chamadas de construtores overloads(this()), o compilador
        adiciona por padrão a instrução super(), chamando o construtor da superclass(Animal)
    */
    Horse() {
        super();
    }
    
}

public class Test {
    public static void main(String[] args) {
        new Horse();

        String value = "5. passa os valores das variaveis de instancia de Object explicitamente, se houver \n" +
            "4. Object() \n" +
            "6. conclui a construção de Object() \n" +
            "7. passa os valores das variaveis de instancia de Animal explicitamente, se houver \n" +
            "3. Animal() calls super() \n" +
            "8. conclui a construção de Animal() \n" +
            "9. passa os valores das variaveis de instancia de Horse explicitamente, se houver \n" +
            "2. Horse() calls super() \n" +
            "10. conclui a construção de Horse() \n" +
            "1. main() calls new Horse()";

        System.out.println(value);

    }
}