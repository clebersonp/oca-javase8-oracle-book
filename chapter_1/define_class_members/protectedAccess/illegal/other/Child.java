package other;

import certification.Parent;

class Child extends Parent {
    public void testIt() {
        System.out.println("x is " + this.x + " by inheritance"); // acessando via inheritance o membro protected da superclass
    }
}