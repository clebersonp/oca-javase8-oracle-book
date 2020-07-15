package nonAccess.finalAccess;

/*
Classe final significa que não pode ser herdada, evitando de overriding os metodos.
Pouco usada pois vai contra os principios de OO e flexibilidade,
porem pode ser usada para tornar uma classe segura, igual a classe java.lang.String que tambem é final.
*/

public final class MyFinalClass {
    public String fullName(String name, String surname) {
        return name + " " + surname;
    }
}