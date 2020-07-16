/*
Compilar dentro do diretorio legal: javac TestEnum.java
Executar dentro do diretorio legal: java TestEnum
*/

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals(String s) {
        sound = s;
    }
}
class TestEnum {
    static Animals a;
    Animals animals;
    public static void main(String[] args) {

        /*
        Compila sem erro pois a variavel eh do tipo do enum Animals e eh static.
        O melhor seria utilizar o nome do tipo do enum para utilizar as constantes.
        Ex: Animals.DOG
        */
        System.out.println(a.DOG.sound + " " + Animals.FISH.sound);
        new TestEnum().test();
    }

    /*
    Compila pelo mesmo fato acima
    */
    public void test() {
        System.out.println(animals.DOG.sound + " " + animals.FISH.sound);
    }
}