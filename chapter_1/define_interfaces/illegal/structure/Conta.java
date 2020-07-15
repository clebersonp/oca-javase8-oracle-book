/*
Para compilar dentro do diretorio structure: javac -cp ../ Conta.java 
*/

package structure;

// Não compila, vários erros na definição da interface PagavelInterface
public class Conta implements PagavelInterface {
    private double valor;
    private java.time.LocalDate dataPagamento;

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public java.time.LocalDate getValidoAte() { // metodo da interface implementado
        return java.time.LocalDate.now().plusDays(15L);
    }

    public java.time.LocalDate getDataPagamento() {
        return this.dataPagamento;
    }
    public void setDataPagamento(java.time.LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void printDescription() {
        System.out.println("Data de validade: " + this.getValidoAte()); 
        System.out.println("Acessada por herança. Tem data de pagamento? " + HAS_DATA_PAGAMENTO); // variavel constante da interface acessada semelhante a herança
        System.out.println("Acessada de maineira static. Tem data de pagamento? " + PagavelInterface.HAS_DATA_PAGAMENTO); // variavel constante da interface acessada semelhante a herança
        System.out.println("Data de pagamento: " + this.getDataPagamento());
    }

    public static void main(String[] args) {
        Conta contaLuz = new Conta();
        contaLuz.setValor(300.50);
        contaLuz.setDataPagamento(java.time.LocalDate.now());

        contaLuz.printDescription();
    }
}