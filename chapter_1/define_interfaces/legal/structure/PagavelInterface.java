package structure;

/*
Interfaces são usadas para definir um contrato, ou seja, o que as classes que implementarão serão obrigadas a fazer;
Interfaces são por padrão abstract, ou seja, é redundante definir uma interface com a palavra abstract;
A interface pode ser default(de acesso ao package) ou public;
A interface não pode ser final e nem protected;
A interface pode extends outras interfaces somente, e não deve implementar os metodos, só repassar;
A partir do java-8 interfaces podem conter default e static methods;
Está forma tambem está correta para definir uma interface: public interface PagavelInterface {
*/
public abstract interface PagavelInterface extends java.io.Serializable {

    /*
        Constantes na interface são consideradas, por padrão pelo compilador, como public static e final;
        É redundante utilizar as keywords public static final;
        Interfaces só pode conter variáveis constantes e não variaveis de instância; 
    */
    public static final Boolean HAS_DATA_VALIDADE = Boolean.TRUE;
    Boolean HAS_DATA_PAGAMENTO = Boolean.TRUE;

    /*
        Métodos que não usam a keyword default ou static, são sempre consideradas pelo compilador como public abstract;
        É redundante utilizar as keywords public ou static na definição do method;
        O método não pode ser marcado com as keywords final, strictfp ou native
    */
    public abstract double getValor();
    java.time.LocalDate getValidoAte(); // o compilador entende como public abstract java.time.LocalDate getValidoAte();

}