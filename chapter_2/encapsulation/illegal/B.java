package illegal;

public class B {
    // variaveis de instancia public, apesar de compilar, não é caracteristica de encapsulamento
    // pois qualquer classe pode alterar o valor diretamente
    public Integer size;
    public String name;
    public String color;
}