/*
Compilar dentro do diretorio className: javac -cp ../../ ./WrongClassNameFile.java ou javac WrongClassNameFile.java por que o a opção -classpath do javac por padrão é ./(diretório atual)
Executar dentro do diretorio className: java -cp ../../ illegal.className.WrongClassNameFile
*/

package illegal.className;

// não compila pois a classe public no código fonte tem que ser o mesmo do nome do arquivo .java
public class RightClassNameFile {
    public static void main(String arguments[]) {
        WrongClassnameFile wc = new WrongClassNameFile();
        wc.value = 10;
        System.out.println("Don't compile: " + wc.value);
    }
}

class WrongClassNameFile {
    int value;
}