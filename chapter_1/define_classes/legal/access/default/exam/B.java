package exam;

// comando para compilar ambas classes dentro do diretorio exam: javac ../cert/A.java B.java
// comando para executar dentro do diretorio exam: java -cp ../ exam.B 

import cert.A; // compila pois a classe A e public access e tem visibilidade fora do package cert e em qualquer lugar do projeto

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.x = 10;

        System.out.println(a.x);
    }
}