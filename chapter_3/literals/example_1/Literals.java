/*
Compilar dentro do diretorio example_1: javac Literals.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Literals
*/



package example_1;

/*
            'b'         char literal
            42          int literal
            false       boolean literal
            254.343     double literal

*/

public class Literals {
    public static void main(String[] args) {

        // UNDERSCORE

        int pre7 = 1000000;
        int with7 = 1_000_000;                  // a partir do java 7, usando underscore para facilitar a leitura
        System.out.println(pre7 == with7);
        
        // int i0 = 1_000_000_;                 // illegal
        // int i1 = _1_000_000;                 // illegal
        int i2 = 10_000_0;                      // legal

        // int i3 = 0B_101;                     // illegal
        // int i4 = 0X_16;                      // illegal

        double d1 = 25_00.25;                   // legal
        double d2 = 25.00_25;                   // legal

        float f1 = 25_00.25F;                   // legal
        float f2 = 25.00_25F;                   // legal

        // double d3 = 25_.25;                  // illegal
        // double d4 = 25._25;                  // illegal
        // float f3 = 25_.25F;                  // illegal
        // float f4 = 25._25F;                  // illegal





        // Decimal Literals

        int length = 343;

        
        
        
        // Binary Literals
        
        int b1 = 0B101010;                      // 42
        int b2 = 0b0011;                        // 3

        
        
        
        
        // Octal Literals
        
        int five = 0_5;                         // 5
        System.out.println(five);
        int six = 06;                           // 6
        int seven = 07;                         // 7
        int eight = 010;                        // 8    
        int nine = 011;                         // 9

        
        
        
        // Hexadecimal Literals
        // 0 1 2 3 4 5 6 7 8 9 a b c d e f
        
        int x = 0X0001;
        int y = 0x7fffffff;
        int z = 0xDeadCafe;

        
        
        
        // Long suffix l or L
        
        long jo = 110599L;
        long so = 0xFFFFl;

        
        
        
        
        // Floating point Literals
        
        double d = 11301874.9881024;
        // float f = 23.568874;                 // não compila, precisa do suffix f ou F. Floating point default is doubles
        float g = 54654654.654654654F;
        double d5 = 21345123.5646978D;          // não precisa do suffix para double, mas OK
        double d6 = 4546.654654;

        // int a = 25,465;                      // não compila por causa da virgula

        
        
        
        
        
        // Boolean Literals
        
        boolean t1 = true;
        // boolean b_1 = 0;                     // não compila
        // int i5 = 1; if (i5) {}               // não compila


        
        
        
        // Character Literals are 16-bit unsigned (0 to 65535)
        
        char aChar = 'a';
        char bChar = '@';
        char letterN = '\u004E';                // Letter 'N' Unicode
        System.out.println(String.format("%s %s %s", aChar, bChar, letterN));

        // cabem dentro de um char 16-bit unsigned, all legal
        char a_1 = 0x892;                       // Hexadecimal literal
        char a_2 = 982;                         // int literal
        char a_3 = (char) 70000;                // cast eh obrigatorio pq 70000 está fora do range
        char a_4 = (char) -98;                  // cast eh obrigatorio pq -28 está fora do range
        // char c_1 = -98;                      // não compila, o cast eh obrigatorio pq -28 está fora do range
        System.out.println(String.format("%s %s %s %s", a_1, a_2, a_3, a_4));
        
        
        
        
        // Scapes
        char a_5 = '\"';                        // "
        char a_6 = '\n';                        // quebra de linha
        char a_7 = '\t';                        // tabulacao
        String s_1 = "\"";
        String s_2 = "\\";                      // barra \
        String s_3 = "\n";
        String s_4 = "\\";
        System.out.println(String.format("%s %s %s %s %s %s %s", a_5, a_6, a_7, s_1, s_2, s_3, s_4));



        // Literal Values for Strings
        String s = "Bill Joy";                  // Primeira maneira de representar um literal String
        System.out.println("Bill" + " Joy");    // Segunda maneira de representar um literal String        
    }
}