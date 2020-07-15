/*
Compilar dentro do diretorio illegal: javac -cp ../ Record.java
*/

package illegal;

class Record {
    private int fileNumber;
    private int recNumber;

    public Record() {}

    private Record(int fileNumber, int recNumber) {
        this.fileNumber = fileNumber;
        this.recNumber = recNumber;
    }

    // não compila. Argument final significa que não pode ter o valor da sua variavel alterado dentro do metodo(local variable)
    public Record getRecord(final int fileNumber, final int recNumber) {
        fileNumber = 8;
        recNumber = 10;
        return new Record(fileNumber, recNumber);
    }

    @Override
    public String toString() {
        return "Record: [ fileNumber: "
        + this.fileNumber + ", recNumber: "
        + this.recNumber + " ]";
    }

    public static void main(String[] args) {
        Record r = new Record();
        r = r.getRecord(10, 5);

        System.out.println(r);
    }
}