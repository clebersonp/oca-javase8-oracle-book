/*
Compilar dentro do diretorio example_1: javac Test.java
*/

package example_1;

interface I1 {
    default int doStuff() {
        return 1;
    }
}

interface I2 {
    default int doStuff() {
        return 2;
    }
}

/*
Interfaces que possuem methods default de mesma assinatura, deve ser Override pela class concreta,
pois o compilador não saberia qual das versões invocar,
evitando o DDD( Deadly Diamond Death)

                              DDD

                interface I1        interface I2
                    ^                    ^
                    |                    |
                int doStuff()       int doStuff()
                    \                    /
                     \                  /
                      \                /
                       \              /            
                        \            /
                         \          /
                          \        /
                           \      /
                            \    /
                             \  /
                              \/
                        MultInt instance

*/
class MultiInt implements I1, I2 {
    
    /*
        Não compila pois não overriding o method por conta da ambiguidade de metodos default nas interfaces
        Msg: class MultiInt inherits unrelated defaults for doStuff() from types I1 and I2
    @Override
    public int doStuff() {
        return 3;
    }
    */
}

public class Test {
    public static void main(String[] args) {
        MultiInt mi = new MultiInt();

        System.out.println(mi.doStuff());
    }
}