// legal identifiers:
// Só pode começar com letras, caracter de moeda e underscore. Começar com digitos é proibido;
// Após o primeiro caracter, o identificador pode conter qualquer combinação de letras, caracter de moeda, underscore e até números;
// Não há limites para o número de caracters para um identifier;
// Não pode utilizar keywords do java como nome de identificadores;
// Nome de identificadores em java são case sensitive, ou seja, foo é totalmente diferente de FOO;

// Não compila
class IllegalIdentifier {
        int :b; // só aceita letras, caracter de moeda e underscore
        int -d; // só aceita letras, caracter de moeda e underscore
        int e#; // só aceita letras, caracter de moeda e underscore e números
        int .f; // só aceita letras, caracter de moeda e underscore
        int 7g; // só aceita letras, caracter de moeda e underscore
        int default; // não aceita keywords
        int assert; // não aceita keywords
        int const; // não aceita keywords
        
        public static void main(String[] args) {
                IllegalIdentifier illegal = new IllegalIdentifier();
                illegal.:b = 1;       
                System.out.println(illegal.:b);
        }
}

/*
Keywords java:

abstract
assert
break
boolean
byte
case
catch
char
class
const
continue
default
do
double
else
enum
extends
final
finally
float
for
goto
if
instanceof
int
interface
implements
import
long
native
new
package
private
protected
public
return
short
static
strictfp
super
switch
synchronized
this
throw
throws
transient
try
void
volatile
while
*/