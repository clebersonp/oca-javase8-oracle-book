package illegal.example1;

public abstract class Vehicle {
    private String type;
    public abstract void goUpHill();
    public abstract void goDownHill();
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type= type;
    }
}