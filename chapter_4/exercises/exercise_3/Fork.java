/*
Compilar dentro do diretorio exercise_3: javac Fork.java 
Executar dentro do diretorio exercise_3: java -cp ../ exercise_3.Fork
*/

package exercise_3;

public class Fork {
    public static void main(String[] args) {
       if (args.length == 1 | args[1].equals("test")) {
           System.out.println("test case");
       } else {
           System.out.println("production " + args[0]);
       }
    }
    // command-line: java Fork live2
    // Result: E. -> An exception is thrown at runtime
}