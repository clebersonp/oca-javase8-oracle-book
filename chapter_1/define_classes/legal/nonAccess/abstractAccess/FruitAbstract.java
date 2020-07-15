/*
Classe abstract não pode ser instanciada;
Pode conter nenhum ou varios metodos abstracts;
Basta apenas um método ser abstract para a classe tambem ser abstract;
Pode conter metodos concretos;
Classe abstract utilizada para flexibilidade, extensibilidade e polimorfismo
*/

package nonAccess.abstractAccess;

public abstract class FruitAbstract {
    private String name;
    private double weight;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // este metodo concreto na classe abstract pode ser overriding pelas subclasses
    public String getFullDescription() {
        return "Fruit name: " + this.name + ", weight: " + this.weight + ", price: " + this.getPrice();
    }

    public abstract double getPrice();
    public abstract void setPrice(double price);
}