/*
Compilar dentro do diretorio example_1: javac -cp ../ TestShapes.java
Executar dentro do diretorio example_1: java -cp ../ example_1.TestShapes
*/

package example_1;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class TestShapes {
    public static void main(String[] args) {
        List<GameShape> gameShapes = Stream.of(new PlayerPiece(), new TilePiece()).collect(Collectors.toList());
        TestShapes.doShapes(gameShapes);
    }

    // usando o metodo de forma polimorfica
    // o metodo só pode chamar membros do objeto GameShape(a não ser que exista o downcast, cast para um tipo mais especifico)
    // ou seja, é totalmente dependente do tipo declarado no metodo
    public static void doShapes(List<GameShape> gameShapes) {
        gameShapes.stream().forEach(g -> {
            System.out.println(String.format("Instance real type: %s", g.getClass().getSimpleName()));
            g.displayShape();
        });

        /*
            ou usando reference method java 8
            gameShapes.stream().forEach(GameShape::displayShape);
        */
    }
}