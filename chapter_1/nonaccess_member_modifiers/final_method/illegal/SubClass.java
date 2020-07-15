/*
Compilar dentro do diretorio illegal: javac -cp ../ SubClass.java
*/

package illegal;

class SubClass extends SuperClass {
    
    // não compila pois é permitido overriding metodos da superclass que tem modificador 'final';
    @Override
    public void showSample() {
        super.showSample();
        System.out.println("Another thing from SubClass");
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.showSample();
    }
}