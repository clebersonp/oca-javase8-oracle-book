/*
Compilar dentro do diretorio example_1: javac Salary.java
Executar dentro do diretorio example_1: java -cp ../ example_1.Salary
*/

package example_1;

/*
operador ternario:
    x = (boolean expression) ? value to assign if true : value to assign if false
*/

public class Salary {
    public static void main(String[] args) {
        int numOfPets = 3;
        String status = (numOfPets < 4) ? "Pet limit not exceeded" : "too many pets";
        System.out.println("This pet status is " + status);

        int sizeOfYard = 10;
        String status_2 = (numOfPets < 3) ? "Pet count OK" : (sizeOfYard > 8) ? "Pet limit on the edge" : "too many pets";
        System.out.println("Pet status_2 is " + status_2);
    }
}