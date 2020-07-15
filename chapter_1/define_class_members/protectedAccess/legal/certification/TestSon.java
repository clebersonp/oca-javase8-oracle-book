/*
Para compilar dentro do diretorio certification: javac -cp ../ TestSon.java
Para executar dentro do diretorio certification: java -cp ../ certification.TestSon
*/

package certification;

class TestSon {
    public static void main(String[] args) {
        Son s = new Son();
        s.testIt(); // dentro do metodo testIt acessara o membro protected 'x' via herança

        // Ok acessar o membro 'x' protected via referencia de instancia, pois ambas classes,
        // superclass e subclass, estão no mesmo package
        System.out.println("x is " + s.x + " by instance reference both in the same package");
    }
}