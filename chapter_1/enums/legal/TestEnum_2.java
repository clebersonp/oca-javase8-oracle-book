/*
Compilar dentro do diretorio legal: javac TestEnum_2.java
Executar dentro do diretorio legal: java TestEnum_2
*/

class Animal {
    public static final String DOG = "woof";
    public static final String CAT = "meow";
    public static final String FISH = "burble";
}

public class TestEnum_2 {
    static Animal a_1;
    Animal a_2;

    /*
    Compila sem erro pois a variavel eh do tipo do String e eh static.
    O melhor seria utilizar o nome do tipo do enum para utilizar as constantes.
    Ex: Animal.DOG
    */
    public static void main(String[] args) {
        System.out.println(a_1.DOG + " " + a_1.FISH);

        new TestEnum_2().test();
    }

    /*
    Compila pelo mesmo fato acima
    */
    public void test() {
        System.out.println(a_2.DOG + " " + a_2.FISH);
    }
}