package structure;

public enum CoffeeSizeEnum {
    BIG(8),
    HUGE(10),
    OVERWHELMING(16) {                      // inicia o bloco do código que define o corpo para esta constante
                                            
        @Override
        public String getLidCode() {        // override o método definido em CoffeeSizeEnum
            return "A";
        }

    }; // quando existe mais código logo depois é necessário inserir ;

    CoffeeSizeEnum(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
        return this.ounces;
    }

    public String getLidCode() {        // este método é override pela constante OVERWHELMING;
        return "B";                     // o valor default para retornar para as constantes;
    }
}