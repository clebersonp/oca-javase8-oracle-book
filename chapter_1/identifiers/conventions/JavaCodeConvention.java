class JavaCodeConvention {   
    static final String CLASSES_INTERFACES = "Classes and interfaces : primeira letra maiuscula seguido do padrão CamelCase. Classes usam substantivos e interfaces usam adjetivos";
    static final String CLASSES_EXAMPLE = "Classes example:    Dog     Account     PrintWriter";
    static final String INTERFACES_EXAMPLE = "Interfaces example: Runnable    Serializable";
    static final String METHODS = "Methods: primeira letra minuscula seguido do padrão camelCase. Nomes geralmente são verbos substantivos";
    static final String METHODS_EXAMPLE = "Methods example:    getName     doCalculation   setCustomerName";
    final static String VARIABLES = "Variables: assim como methods.";
    final static String VARIABLES_EXAMPLE = "Variables example:  buttonWidth     accountBalance      myString";
    final static String CONSTANTS = "Constants: São utilizados os modificadores static and final. nome deve ser todo em maiusculo e se houver nomes compostos devem ser separados por _(underscore).";
    final static String CONSTANTS_EXAMPLE = "Constants example:  MIN_HEIGHT  MAX_VALUE   EMPTY";

    public static void main(String... vars) {
        System.out.println("\n========================================================");
        System.out.println(JavaCodeConvention.CLASSES_INTERFACES);
        System.out.println(JavaCodeConvention.CLASSES_EXAMPLE);
        System.out.println(JavaCodeConvention.INTERFACES_EXAMPLE);
        System.out.println("========================================================\n");
        System.out.println("========================================================");
        System.out.println(JavaCodeConvention.METHODS);
        System.out.println(JavaCodeConvention.METHODS_EXAMPLE);
        System.out.println("========================================================\n");
        System.out.println("========================================================");
        System.out.println(JavaCodeConvention.VARIABLES);
        System.out.println(JavaCodeConvention.VARIABLES_EXAMPLE);
        System.out.println("========================================================\n");
        System.out.println("========================================================");
        System.out.println(JavaCodeConvention.CONSTANTS);
        System.out.println(JavaCodeConvention.CONSTANTS_EXAMPLE);
        System.out.println("========================================================\n");
    }
}