package nonAccess.abstractAccess;

// não compila pois uma classe não pode ser ao mesmo tempo abstract e final.
// classes abstract e final são opostos:
// class abstract: pode ser herdada
// class final: não pode ser herdada
public abstract final class FruitAbstract {
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

    // não compila pois um metodo abstract não tem implementação, ou seja, deve terminar com ;
    public abstract String getDetails() {
        return "Details";
    }

    // não compila pois um metodo não abstract, ou seja, concreto deve ter implementação e deve terminar com }
    public int getQuantity();
}