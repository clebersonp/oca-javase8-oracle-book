/*
Compilar dentro do diretorio illegal: javac IllegalVarArgsSignature.java
*/

package illegal;

import java.util.Objects;

public class IllegalVarArgsSignature {
    public static void main(String[] args) {

        IllegalVarArgsSignature ilvarargs = new IllegalVarArgsSignature();
        System.out.println(ilvarargs.join("Allan", "Jake", "Lee", "Marks", 35, 50, 40, 13));
    }

    /*
    Var-args: Variable Argument List;
    Syntax: Type... name;
    No método com var-args é permitido ter outros parametros;
    O parametro var-args deve ser sempre o ultimo parametro, quando existir mais de um;
    Não pode existir dois parametros ou mais do tipo var-args.
    */

    // não compila, não pode existir mais de um var-args na assinatura de um metodo
    public String join(String... values, int... ages) {
        StringBuilder sb = new StringBuilder("");
        /*if (Objects.nonNull(values)) {
            for(String value : values) {
                sb.append(value).append(" ");
            }
        }*/
        if (Objects.nonNull(ages)) {
            for(int age : ages) {
                sb.append(age).append(" ");
            }
        }
        return sb.toString();
    }

    // não compila, var-args deve ser sempre o ultimo parametro na assinatura do metodo
    public String union(String... values, int level) {
        StringBuilder sb = new StringBuilder("");
        if (Objects.nonNull(values)) {
            for(String value : values) {
                sb.append(value).append(" ");
            }
            sb.append(level);
        }
        return sb.toString();
    }
}