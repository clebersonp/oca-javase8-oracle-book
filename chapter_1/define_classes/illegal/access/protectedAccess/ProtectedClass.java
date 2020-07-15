/*
Para compilar dentro do diretorio protectedAccess: javac -cp ../ ProtectedClass.java
*/

package access.protectedAccess;

// não compila pois não aceita modificador de acesso protected em classes, somente public ou default(package access level)
protected class ProtectedClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}