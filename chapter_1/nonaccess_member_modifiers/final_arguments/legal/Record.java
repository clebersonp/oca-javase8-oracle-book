/*
Compilar dentro do diretorio legal: javac -cp ../ Record.java
Executar dentro do diretorio legal: java -cp ../ legal.Record
*/

package legal;

class Record {
    private int fileNumber;
    private int recNumber;

    public Record() {}

    private Record(int fileNumber, int recNumber) {
        this.fileNumber = fileNumber;
        this.recNumber = recNumber;
    }

    // argument final significa que não pode ter o valor da sua variavel alterado dentro do metodo(local variable)
    public Record getRecord(final int fileNumber, final int recNumber) {
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