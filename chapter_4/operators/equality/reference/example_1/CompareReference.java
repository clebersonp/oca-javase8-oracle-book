/*
Compilar dentro do diretorio example_1: javac CompareReference.java
Executar dentro do diretorio example_1: java -cp ../ example_1.CompareReference
*/

package example_1;

import javax.swing.JButton;

public class CompareReference {
    public static void main(String[] args) {

        JButton a = new JButton("Exit");
        JButton b = new JButton("Exit");
        JButton c = a;

        /*
            no java quando usado operado == para referencias, é olhada a
            igualdade dos valores das variaveis e não igualdade entre objetos, ou seja,
            valor da variavel de referencia eh o ponteiro de memoria que localiza o objeto
            na memoria heap da JVM;
            Se for necessário realizar a comparação dos objetos, ou seja, estados entre objetos,
            eh necessário override o metodo equals() de Object para dizer como comparar objetos
            de mesmo tipo
        */
        System.out.println("Is reference a == b? " + (a == b));
        System.out.println("Is reference a == c? " + (a == c));

    }
}