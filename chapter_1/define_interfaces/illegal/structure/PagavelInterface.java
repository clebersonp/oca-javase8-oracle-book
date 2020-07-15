package structure;

/*
Não compila pois interface não podem ser final;
Interfaces devem ser publics ou default(package level access)
Não podem implements outras classes ou interfaces, somente extends outras interfaces;
Não podem ter variaveis que não são constantes, assinadas com public static final
Não podem ter methods concretos;
Os metodos devem ser public
*/
public final interface PagavelInterface implements java.io.Serializable {

    private Boolean HAS_DATA_VALIDADE = Boolean.TRUE; // variaveis de interface devem ser constantes, não podem ser private
    Boolean HAS_DATA_PAGAMENTO = Boolean.TRUE;

    public double getValor() { // methods de interface devem ser abstract, ou seja, não pode ter um corpo e devem terminar com ;
        return 20.0;
    }
    protected java.time.LocalDate getValidoAte(); // methods devem ser public abstracts, ou simplesmente não adicionar as keywords public abstract que o compilador já faz para nós.
}