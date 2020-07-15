/*
Compilar dentro do diretorio legal: javac -cp ../ LocalVariable.java
Executar dentro do diretorio legal: java -cp ../ legal.LocalVariable
*/

package legal;

public class LocalVariable {
    public void doStuff() {
        final int x = 7; // único modificador aceito para variaveis locais
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