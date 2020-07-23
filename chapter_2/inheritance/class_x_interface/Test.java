/*
Compilar dentro do diretorio class_x_interface: javac -cp ../ Test.java
Executar dentro do diretorio class_x_interface: java -cp ../ class_x_interface.Test
*/

package class_x_interface;

public class Test {

    public static void main(String[] args) {
        ConcreteClass c = new ConcreteClass();

        // method herdado e (overriding)implementado
        int sumResult = c.sum(5, 15);
        System.out.println("Sum Result: " + sumResult);

        // method herdado e (overriding)implementado
        c.sayHello();

        // variavel de instancia herdada
        c.name = "Some new name";
        System.out.println(c.name);

        // variavel static herdada
        System.out.println(ConcreteClass.COLOR);

        // method herdado
        c.sayHelloWorld();
        
        // interface's default method eh herdado
        c.printing("Hi");

        // static method herdado
        // acessando pelo nome da classe
        ConcreteClass.sayBye();

        // acessando pelo tipo da instancia
        c.sayBye();

        // como membros statics de interface não são herdados, tem que acessar diretamente;
        System.out.println(MyInterface.PI);
        MyInterface.print();

        System.out.println(String.format("Accessing by class name: PI value is '%s'", ConcreteClass.PI));
        System.out.println(String.format("Acessing by reference type: PI value is '%s'", c.PI));



        // Não compila pois interface's static methods não são herdados, são somente acessados diretamente
        // ConcreteClass.print();
        // c.print();
    }

}