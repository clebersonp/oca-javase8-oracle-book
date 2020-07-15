package illegal;

class SuperClass {
    public final void showSample() { // metodo final significa que não pode ser overriding pelas subclasses
        System.out.println("One thing from SuperClass");
    }
}