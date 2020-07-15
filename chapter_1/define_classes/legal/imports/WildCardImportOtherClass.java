package legal.imports;

// importando uma classe sem o wildcard
import java.util.Date;

// importando todas classes do package java.sql da huge libary do java utilizando Wildcard *.
// não importa sub packages, somente arquivos class
import java.sql.*;

public class WildCardImportOtherClass {
    public static void main(String[] args) {
        Date utilDate = new Date(); // sem o fully qualified name o compilador dá prioridade para imports especificos
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println(utilDate);
        System.out.println(sqlDate);
    }
}
