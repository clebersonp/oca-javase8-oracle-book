// legal identifiers:
// Só pode começar com letras, caracter de moeda e underscore. Começar com digitos é proibido;
// Após o primeiro caracter, o identificador pode conter qualquer combinação de letras, caracter de moeda, underscore e até números;
// Não há limites para o número de caracters para um identifier;
// Não pode utilizar keywords do java como nome de identificadores;
// Nome de identificadores em java são case sensitive, ou seja, foo é totalmente diferente de FOO;

class LegalIdentifier {
        int _a;
        int $c;
        int ____2_w;
        int _$;
        int this_is_a_very_detailed_name_for_an_identifier;
        
        public static void main(String[] args) {
                LegalIdentifier legal = new LegalIdentifier();
                legal._a = 1;
                legal.$c = 2;
                legal.____2_w = 3;
                legal._$ = 4;
                legal.this_is_a_very_detailed_name_for_an_identifier = 5;
                
                System.out.println("_a: " + legal._a);
                System.out.println("$c: " + legal.$c);
                System.out.println("____2_w: " + legal.____2_w);
                System.out.println("_$: " + legal._$);
                System.out.println("this_is_a_very_detailed_name_for_an_identifier: " + legal.this_is_a_very_detailed_name_for_an_identifier);
        }
}