/*
Compilar dentro do diretorio legal: javac LegalVarArgsSignature.java
Executar dentro do diretorio legal: java -cp ../ legal.LegalVarArgsSignature
*/

package legal;

import java.util.Objects;

public class LegalVarArgsSignature {
    public static void main(String[] args) {

        LegalVarArgsSignature lvarargs = new LegalVarArgsSignature();
        System.out.println(lvarargs.join("Allan", "Santos", "da", "Silva"));

    }

    /*
    Var-args: Variable Argument List;
    Syntax: Type... name;
    No método com var-args é permitido ter outros parametros;
    O parametro var-args deve ser sempre o ultimo parametro, quando existir mais de um;
    Não pode existir dois parametros ou mais do tipo var-args.
    */

    public String join(String... values) {
        String result = "";
        if (Objects.nonNull(values)) {
            StringBuilder sb = new StringBuilder();
            for(String value : values) {
                sb.append(value).append(" ");
            }
            result = sb.toString();
        }
        return result;
    }
}