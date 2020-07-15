/*
Compilar dentro do diretorio legal: javac -cp ../ LocalVariable.java
*/

package legal;

public class LocalVariable {
    public void doStuff() {
        private int x = 7; // não compila. Unico modificador aceito para variaveis locais é o final
        this.printMore(7);
    }
    private void printMore(int number) {
        System.out.println("Printing the number " + number);
    }

    static public void main(String args[]) {
        LocalVariable lv = new LocalVariable();
        lv.doStuff();
    }
}