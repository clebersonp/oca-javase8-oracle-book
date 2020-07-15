package legal;

/*
Basta um método abstract para a classe se tornar abstract;
Classe abstract pode herdar de outras classes, inclusive abstracts;
É opcional a implementação dos métodos abstracts da superClass, porem é permitido
Pode conter outros metodos abstracts ou não;
Não pode combinar um metodo abstract com modificar 'final' ou 'private', não faz sentido;
*/
public abstract class Car extends Vehicle {

    public void doCarThings() {
        System.out.println("Doing car things from class Car");
    }

    abstract public void carStuffs();

    @Override
    public void goUpHill() {
        System.out.println("Going to up hill na classe abstract Car");
    }
}