/*
Compilar dentro do diretorio example_3: javac -cp ../ TestShapes.java
Executar dentro do diretorio example_3: java -cp ../ example_3.TestShapes
*/

package example_3;

public class TestShapes {
    public static void main(String[] args) {
        PlayerPiece player = new PlayerPiece();
        Object o = player;
        GameShape gameShape = player;
        Animatable animatable = player;

        // o tipo da referença eh PlayerPiece mas está acessando um metodo herdado de GameShape
        player.displayShape();

        // o tipo da referença eh GameShape e está acessando o metodo de instancia do proprio objeto
        gameShape.displayShape();
        
        // não compila, embora player tambem herda de Object
        // o.displayShape();

        // não compila, embora player tambem IS-A Animatable, porem a referença eh do tipo Animatable e não possui tal metodo
        // animatable.displayShape();

        // invoca o metodo override
        player.doSomethingGenerally();

        // embora o tipo da referença eh GameShape(superclass), JVM invoca o metodo override da real instancia do objeto(PlayerPiece) em runtime.
        // isso só eh aceito para metodos de instancias, não é aceito para metodos statics e nem variaveis
        gameShape.doSomethingGenerally();

        // invocando metodo override
        player.doSomethingAbstract();

        // embora a referença seja da superclass(GameShape), em runtime a JVM conhece o tipo real do Object e invoca o metodo override
        // neste exemplo o metodo da superclass eh abstract, por isso eh obrigado a declarar a classe como abstract,
        // protegendo a classe abstract de não ser instanciada com new e invocar o metodo da sua classe sem uma implementação
        gameShape.doSomethingAbstract();

        /*
            Regra somente para metodos de instancia:
            - O compilador somente conhece o tipo da referença do objeto ao invocar o metodo;
            - Em tempo de runtime a JVM conhece o tipo do objeto real no heap ao invocar o metodo;
            - Sempre será invocado o metodo existente na declaração do tipo da referença;
            - Sempre será executado o método override quando o tipo da referença for superclass do tipo do objeto;
        */
    }
}