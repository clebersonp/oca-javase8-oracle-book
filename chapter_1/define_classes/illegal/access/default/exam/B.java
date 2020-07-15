package exam;

// comando para compilar ambas classes dentro do diretorio exam: javac ../cert/A.java B.java

import cert.A; // não compila pois a classe A e default access e não tem visibilidade fora do package cert

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.x = 10;

        System.out.println(a.x);
    }
}