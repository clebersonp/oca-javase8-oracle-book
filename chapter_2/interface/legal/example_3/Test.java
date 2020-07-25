/*
Compilar dentro do diretorio example_3: javac Test.java
Executar dentro do diretorio example_3: java -cp ../ example_3.Test
*/

package example_3;

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
        Overriding o method por conta da ambiguidade de metodos default nas interfaces
    */
    @Override
    public int doStuff() {
        return 3;
    }
}

public class Test {
    public static void main(String[] args) {
        MultiInt mi = new MultiInt();

        System.out.println(mi.doStuff());
    }
}