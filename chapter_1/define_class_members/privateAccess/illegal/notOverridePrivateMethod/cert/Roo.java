package cert;

public class Roo {

    // membros private não podem ser acessado por nenhuma outra classe, 
    // nem mesmo as subclasses tem acesso. Somente a class que contem o membro private tem acesso.
    // Método privados não podem ser overriding pelas subclasses.
    // Não tem erro, porem o método com a mesma assinatura na subclass não passa de um método comum,
    // já que a subclass não tem visibilidade dos membros privates das superclasses.
    private String doRooThings() {
        return "fun from Roo class";
    }

    public String doRooThingsAccessible() {
        return this.doRooThings();
    }
}