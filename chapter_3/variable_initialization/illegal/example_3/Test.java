/*
    Compilar dentro do diretorio example_3: javac Test.java
*/

package example_3;

public class Test {
    
    public static void main(String[] args) {
        new Test().go();
    }

    void go() {
        String name;

        /*
            Não compila. Null é eh valor e eh diferente de não inicializada(sem valor).
            Variaveis de referencia locais dever ser inicializadas nem se for com null;
        */
        if (name != null) {
            System.out.println(String.format("Tentando verificar se "
                + "a referencia de objeto local nao inicializada eh diferente de null: %s", name));
        }
    }
}