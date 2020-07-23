package from_object;

// Todas classes herdam de Object e reutilizam todos seus metodos
public class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        // metodo equals herdado de object
        if (!t1.equals(t2)) {
            System.out.println("Não são iguais");
        }
        // comparando t1 Test com o supertipo Object
        if (t1 instanceof Object) {
            System.out.println("Object Test is instance of Object by default, inheritance");
        }
    }
}