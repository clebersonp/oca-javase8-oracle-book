/*
Compilar dentro do diretorio illegal: javac TestEnum.java
*/

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals(String s) {
        sound = s;
    }
}
class TestEnum {
    public static void main(String[] args) {
        new TestEnum().test();
    }

    /*
    Não compila pois a variavel do tipo Animals eh local e ainda nao foi inicializada
    */
    public void test() {
        Animals a;
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}