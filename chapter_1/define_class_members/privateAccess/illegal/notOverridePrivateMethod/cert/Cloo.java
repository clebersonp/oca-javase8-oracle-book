package cert;

class Cloo extends Roo {
    public void testCloo() {
        System.out.println(this.doRooThingsAccessible());
    }

    @Override
    public String doRooThings() {
        return super.doRooThings(); // não compila pois esse metodo não é override, metodos private não são override pelas subclasses
    }
}