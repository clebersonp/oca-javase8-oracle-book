/*
Para compilar dentro do diretorio somethingElse: javac -cp ../ AccessClass.java
*/

package somethingElse;

import certification.OtherClass;

class AccessClass {
    static public void main(String args[]) {
        OtherClass o = new OtherClass();

        // Não compila pois a instancia de OtherClass dentro da classe AccessClass,
        // que está em outro package, está acessando um membro default, o qual só
        // deveria ter acesso dentro do mesmo package.
        o.testIt();
    }
}