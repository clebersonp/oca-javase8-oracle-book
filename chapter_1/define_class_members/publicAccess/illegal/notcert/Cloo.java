package notcert;

import cert.Roo;

// não compila pois a class Cloo não tem visibilidade a classe Roo que tem o modificador default(package level access)
class Cloo extends Roo {
    public void testCloo() {
        // não tem acesso ao metodo da superclass, pois embora o método é public, a classe é default (package level access)
        System.out.println(this.doRooThings());
    }
}