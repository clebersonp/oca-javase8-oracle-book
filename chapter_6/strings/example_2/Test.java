/*
Compilar dentro do diretorio example_2: javac Test.java
Executar dentro do diretorio example_2: java -cp ../ example_2.Test
*/

package example_2;

public class Test {
    public static void main(String[] args) {

        /*
            Strings são imutáveis, ou seja, cada operação com a string resulta em uma nova string na memória.
            E para cada operação que não referencia a string, será perdido o objeto na memória

            2 referencias e 8 objetos criados no pool de strings

            String constant pool -> area especial de strings na memória para torna-la mais eficiente
            Quando uma nova string literal eh criada, a JVM verifica no pool de strings se já existe
            uma literal igual, se existir essa referencia passa a apontar para a string. Por isso as strings são imutaveis.
            Pois mais de uma referencia pode apontar para o mesmo objeto.
        */

        String s1 ="spring ";                           // 1 objeto no pool de strings      s1 = "spring "
        String s2 = s1 + "summer ";                     // 3 objetos no pool de strings     s1 = "spring ", "summer "(lost), s2 = "spring summer "
        s1.concat("fall ");                             // 5 objetos no pool de strings     s1 = "spring ", "summer "(lost), s2 = "spring summer ", "fall "(lost), "spring fall "(lost)
        s2.concat(s1);                                  // 6 objetos no pool de strings     s1 = "spring ", "summer "(lost), s2 = "spring summer ", "fall "(lost), "spring fall "(lost), "spring summer spring "(lost)
        s1 += "winter ";                                // 8 objetos no pool de strings     "spring "(lost), "summer "(lost), s2 = "spring summer ", "fall "(lost), "spring fall "(lost), "spring summer spring "(lost), "winter "(lost), s1 = "spring winter "
        System.out.println(s1 + " " + s2);

    }
}