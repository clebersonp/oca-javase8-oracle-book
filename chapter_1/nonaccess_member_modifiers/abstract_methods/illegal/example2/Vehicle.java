package illegal.example2;

public abstract class Vehicle {
    private String type;
    private abstract void goUpHill();
    public abstract final void goDownHill();
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type= type;
    }
}