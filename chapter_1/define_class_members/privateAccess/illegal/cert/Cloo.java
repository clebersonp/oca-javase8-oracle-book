package cert;

class Cloo extends Roo {
    public void testCloo() {
        System.out.println(this.doRooThings()); // não compila pois esse membro da superclass é private
    }
}