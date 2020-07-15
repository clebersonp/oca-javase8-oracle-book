
// modificadores aceitos para classe: public ou default(sem modificador)

private class IllegalModifierAccessForClass {
    public static void main(String[] args) {
        System.out.println("Not compile"); // modificador de acesso para classe não permitido para private e protected
    }
}