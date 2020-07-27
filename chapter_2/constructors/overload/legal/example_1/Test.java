/*
Compilar dentro do diretorio example_1: javac Test.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Test
*/

/*
Uma das vantagens de ter varios construtores overloades, e de ter a flexibilidade de instanciar objetos
de diferentes maneiras e estados(valores das variaveis de instancia);
E evitar códigos duplicados;
*/

package example_1;

class Animal {
    String name;

    // Overload do construtor
    Animal(String name) {
        /*
            Neste ponto, será invocado o super(), invocando o construtor default da classe Object,
            para somente depois executar a instrução abaixo;
            Regra de ouro, a primeira linha do construtor deve ser this ou super;
            Caso não exista nenhuma das instruções, this ou super, o compilador adiciona super, invocando o construtor de Object;
            Só pode existir uma instrução, this ou super, as duas no mesmo construtor são invalidas;
            Se outros construtores overloadeds usam a instrução this, pelo menos um construtor chamara super;
            Se existirem varios overloads construtores, e nenhum semelhante com o construtor default, então será invocado super(), sem arguments;
        */
        super(); // neste caso o construtor adiciona essa instrução se não houver
        this.name = name;
    }

    // Overload do construtor
    Animal() {
        /*  this e super podem passar parametros, desde sejam statics;
            this ira invocar o Overload construtor com argument do tipo String;
            sempre que o construtor sem arguments for invocado,
            acabara invocando o construtor Overload com argument do tipo String;
        */
        this(makeRandmName());
    }

    /*
        Metodos e variaveis podem ser invocados pelas keywords this() e super() (Overload de construtores)
    */
    static String makeRandmName() {
        int x = (int) (Math.random() * 5);
        String name = new String[] {"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);
        Animal b = new Animal("Zeus");
        System.out.println(b.name);
    }
}