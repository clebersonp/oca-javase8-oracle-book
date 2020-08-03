/*
Compilar dentro do diretorio example_1: javac CheckGC.java
Executar dentro do diretorio example_1: java -Xmx8m -cp ../ example_1.CheckGC
*/

package example_1;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CheckGC {
    
    static List<CheckGC> instancesSaves = new ArrayList<>(0);

    static int numberInstancesToDie = 0;
    static int numberInstancesToBorn = 0;

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        System.out.println(String.format("Total JVM Memory: %smb", rt.totalMemory() / 1024 / 1024));
        System.out.println(String.format("Before Memory: %smb", rt.freeMemory() / 1024 / 1024));

        CheckGC c = null;

        for (int i = 0; i < 10_000; i++) {
            c = new CheckGC();
            c = null;
            numberInstancesToBorn++;        
        }
        
        /*
            Runtime eh Singleton, ou seja, classe especial que tem um simples objeto.
            Runtime possui mecanismo de comunicação direta com a virtual machine;
            O metodo gc() é para invocar o Garbage Collector, porem não eh garantido
            que será executado no momento em que é invocado, nem mesmo se o GC já
            estiver sendo executado, quem gerencia a liberação de memoria é o GC
            e eh responsabilidade do GC liberar memoria, ou seja, auto gerenciamento
            de memoria;
        */
        rt.gc(); 

        System.out.println(String.format("After GC Memory: %smb", rt.freeMemory() / 1024 / 1024));

        System.out.println(String.format("After Memory: %smb", rt.freeMemory() / 1024 / 1024));
    }

    /*
        Metodo que herda de object.
        finalize eh executado antes do objeto ser deletado pelo Garbage Collector

        O problema eh que não ha garantia do garbage collector deletar os objetos,
        e o method finalize não eh garantia que será invocado já que não eh garantia
        que o GC deletara os objetos da heap;
        Por isso não pode colocar codigos essenciais dentro do finalize,
        Finalize só eh invocado apenas uma vez por objeto. Significa se que
        previnir e salver esse objeto para não ser removido pelo GC, a JVM
        sabera que já foi invocado o metodo finalize do objeto e não será
        invocado novamente;
    */
    @Override
    protected void finalize() {
        numberInstancesToDie++;

        System.out.println(String.format("Reference:  %s", this));

        System.out.println(String.format("Say something before died.....  %s", numberInstancesToDie));

        System.out.println(String.format("Number instances to born %s == %s instances to die?  %s",
            numberInstancesToBorn, numberInstancesToDie, numberInstancesToBorn == numberInstancesToDie));

        // salvando os objetos para não serem deletados pelo GC
        instancesSaves.add(this);

        System.out.println(String.format("Quantidade de objetos salvos: %s", instancesSaves.size()));
    }
}