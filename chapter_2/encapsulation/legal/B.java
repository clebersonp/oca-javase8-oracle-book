package legal;

public class B {

    // variaveis de instancia private forca o uso de metodos para acesso e modificação
    // forca o uso do encapsulamento. Beneficios do OO, flexibilidade e manutenabilidade
    private Integer size;
    private String name;
    private String color;

    // Padrão getters and Setters
    // setNomeDaVariavelInstancia
    public Integer getSize() {
        return this.size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}