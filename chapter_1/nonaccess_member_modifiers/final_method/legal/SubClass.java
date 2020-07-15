/*
Compilar dentro do diretorio legal: javac -cp ../ SubClass.java
Executar dentro do diretorio legal: java -cp ../ legal.SubClass
*/

package legal;

class SubClass extends SuperClass {
    
    // overriding metodos da superclass com a mesma assinatura;
    // Assinatura: mesmo nome, quantidade, ordem e tipo dos parametros. O retorno e o modificador do metodo não importa;
    @Override
    public void showSample() {
        super.showSample();
        System.out.println("Another thing from SubClass");
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.showSample();
    }
}