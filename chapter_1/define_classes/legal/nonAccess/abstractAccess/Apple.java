/*
Compilar as classes dentro do diretorio abstractAccess: javac -cp ../../ Apple.java
Executar as classes dentro do diretorio abstractAccess: java -cp ../../ nonAccess.abstractAccess.Apple
*/


package nonAccess.abstractAccess;

class Apple extends FruitAbstract {
    private double price;

    @Override
    public double getPrice() {
        return this.price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Apple greenApple = new Apple();
        greenApple.setName("Green Apple");
        greenApple.setPrice(5.0);
        greenApple.setWeight(0.8);

        System.out.println(greenApple.getFullDescription());
    }
}