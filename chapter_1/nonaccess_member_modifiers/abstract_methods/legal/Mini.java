/*
Compilar as classes dentro do diretorio legal: javac -cp ../ Mini.java
Executar as classes dentro do diretorio legal: java -cp ../ legal.Mini
*/


package legal;

/*
A classe concreta deve implementar todos os metodos abstracts das superclasses;
A classe concreta pode override um metodo concreto da superclasses abstract;
*/
public class Mini extends Car {
    
    @Override // esse metodo é concreto na superclasses abstract, então é opcional override
    public void doCarThings() {
        super.doCarThings(); // invocando o método concreto da superclass
        System.out.println("Doing car things from class Mini");
    }

    @Override
    public void carStuffs() {
        System.out.println("Doing car stuffs in Mini class");
    }

    @Override
    public void goDownHill() {
        System.out.println("Going to down hill from Mini class");
    }

    public static void main(String[] args) {
        Mini m = new Mini();
        m.doCarThings();
        m.carStuffs();
        m.goDownHill();
        m.goUpHill(); // metodo concreto da superclass Car
        m.setType("Type is Mini"); // acessando metodo concreto da superclass Vehicle
        System.out.println(m.getType()); // acessando metodo concreto da superclass Vehicle
    }
}