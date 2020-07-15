/*
Compilar as classes dentro do diretorio illegal.example2: javac -cp ../../ Mini.java
*/


package illegal.example2;

/*
Não compila pois a classe concreta deve implementar todos os metodos abstracts das superclasses;
*/
public class Mini extends Car {

    // não compila pois não é override pois na superclass este metodo está como private, ou seja,
    // nem tem acesso deste ponto e o compilador entende como um novo metodo.
    private void goUpHill() {
        System.out.println("Going up hill from Mini");
    }

    // não compila pois o metodo na superclass está como o modificar 'final' e não pode combinar method abstract com final ou private
    public void goDownHill() {
        System.out.println("Going to down hill in Mini");
    }

    public void doNothing() {
        System.out.println("Doing nothing");
    }

    public static void main(String[] args) {
        Mini m = new Mini();
        m.doNothing();
        m.goUpHill();
        m.goDownHill();
        m.setType("Type is Mini"); // acessando metodo concreto da superclass Vehicle
        System.out.println(m.getType()); // acessando metodo concreto da superclass Vehicle
    }
}