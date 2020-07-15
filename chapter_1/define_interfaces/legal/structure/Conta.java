/*
Para compilar dentro do diretorio structure: javac -cp ../ Conta.java 
Para executar dentro do diretorio structure: java -cp ../ structure.Conta 
*/

package structure;

// Uma classe pode implementar varias interfaces, porem deverá implementar todos os metodos
public class Conta implements PagavelInterface {
    private double valor;
    private java.time.LocalDate dataPagamento;

    @Override
    public double getValor() { // metodo da interface implementado
        return this.valor;
    }
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
        System.out.println("Acessada pela herança. Tem data de validade? " + HAS_DATA_VALIDADE); // variavel constante da interface acessada semelhante a herança
        System.out.println("Acessada de maneira static. Tem data de validade? " + PagavelInterface.HAS_DATA_VALIDADE); // variavel constante da interface acessada de maneira static
        System.out.println("Data de validade: " + this.getValidoAte()); 
        System.out.println("Tem data de pagamento? " + HAS_DATA_PAGAMENTO); // variavel constante da interface acessada semelhante a herança
        System.out.println("Data de pagamento: " + this.getDataPagamento());
    }

    public static void main(String[] args) {
        Conta contaLuz = new Conta();
        contaLuz.setValor(300.50);
        contaLuz.setDataPagamento(java.time.LocalDate.now());

        contaLuz.printDescription();
    }
}