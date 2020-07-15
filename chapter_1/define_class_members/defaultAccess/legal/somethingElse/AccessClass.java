/*
Para compilar dentro do diretorio somethingElse: javac -cp ../ AccessClass.java
Para executar dentro do diretorio somethingElse: java -cp ../ somethingElse.AccessClass
*/

package somethingElse;

class AccessClass {
    static public void main(String args[]) {
        OtherClass o = new OtherClass();

        // compila pois tanto a instancia de OtherClass e a classe AccessClass
        // estão dentro do mesmo package e está acessando um membro default
        o.testIt();
    }
}