package notcert;

import cert.Roo;

class Cloo extends Roo {
    public void testCloo() {
        // quando não usa-se o dot . (acesso via referencia), significa que estamos acessando membros da superclass
        // é comum usar o this. ao invocar o membro da superclass para melhorar a leitura
        // só é possível acessar membros da superclass, se a propria subclass tiver visibilidade da superclass e ter visibilidade do membro da superclass
        System.out.println(doRooThings()); // acessando metodo public da superclass via herença, ou seja, sem o dot . (via referencia)
    }
}