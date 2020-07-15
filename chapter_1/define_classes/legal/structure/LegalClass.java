/*
Comentários podem existir em qualquer lugar sem restrição, ou seja, inicio, meio ou fim do arquivo

Compilar fora do diretorio legal: javac legal/structure/LegalClass.java
Executar fora do diretorio legal: java legal.structure.LegalClass

Compilar dentro do diretorio structure: javac -cp ../../ ./LegalClass.java ou javac LegalClass.java
Executar dentro do diretorio structure: java -cp ../../ legal.structure.LegalClass


*/




// se existir a instrução package, deve ser a primeira do arquivo do código fonte, desconsiderar os comentários
package legal.structure;

// Se existir a instrução package, então as instruções import devem ficar entre a instrução package e a difinição da classe
// Caso não exista instrução package então a instrução import deve ser a primeira
import java.util.*;

// A definição da classe deve vir logo depois da instrução import quando existir a instrução package,
// ou deve vir logo depois da instrução package quando não houver instrução import
// Só pode existir uma class public por arquivo código fonte e o nome do arquivo .java deve ser o mesmo nome da classe
public class LegalClass {

    public String result;

    public static void main (String args[]) {
        LegalClass legalClass = new LegalClass();
        legalClass.result = "Result of LegalClass instance variable";

        OtherClassInsideSameSourceFile o = new OtherClassInsideSameSourceFile();
        o.name = "Name of Other class inside the same source file";

        List<String> list = new ArrayList<>();
        list.add(legalClass.result);
        list.add(o.name);

        System.out.println("\n===============================================================================================");
        System.out.println(list);
        System.out.println("===============================================================================================\n");
    }
}

// import e package instruções se aplica para todas as classes dentro do mesmo arquivo fonte.
// O arquivo fonte pode conter mais de uma classe/interface não public
// As classes/interfaces não public podem ter nomes que não são iguais a nenhuma classe dentro do mesmo arquivo fonte
class OtherClassInsideSameSourceFile {
    public String name;
}

// Todas classes/interfaces internas ao mesmo arquivo fonte, ao compilar a classe public, são gerados os bytecodes individualmente
interface MyInterfaceble {

}
