/*
Compilar dentro do diretorio example_1: javac Electronic.java
*/

public class Electronic implements Device {
    public void doIt(){}
}

abstract class Phone1 extends Electronic {}

abstract class Phone2 extends Electronic {
    public void doIt(int x) {}
}

/*
Compila sem erro pois como Eletronic já implements Device.
Então o filho(Phone3) não precisa implementar, a não ser que queira overriding o metodo
*/
class Phone3 extends Electronic implements Device {
    public void doStuff() {}
}

interface Device {
    public void doIt();
}