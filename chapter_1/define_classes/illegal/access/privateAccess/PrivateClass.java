/*
Para compilar dentro do diretorio privateAccess: javac -cp ../ PrivateClass.java
*/

package access.privateAccess;

// não compila pois não aceita modificador de acesso private em classes, somente public ou default(package access level)
private class PrivateClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}