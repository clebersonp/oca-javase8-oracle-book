/*
Compilar dentro do diretorio illegal: javac TestEnum_2.java
*/

class Animal {
    public static final String DOG = "woof";
    public static final String CAT = "meow";
    public static final String FISH = "burble";
}

public class TestEnum_2 {
    public static void main(String[] args) {
        new TestEnum_2().test();
    }

    /*
    Não compila pois a variavel do tipo Animal eh local e ainda nao foi inicializada
    */
    public void test() {
        Animal a;
        System.out.println(a.DOG + " " + a.FISH);
    }
}