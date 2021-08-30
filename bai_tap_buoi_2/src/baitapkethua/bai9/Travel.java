package baitapkethua.bai9;

public abstract class Travel extends Tax implements ExciceTax{
    private String name;
    private double maxVelocity;
    private double minVelocity;
   // private int numberOfSeats;

    public Travel(String name, double maxVelocity, double minVelocity) {
        this.name = name;
        this.maxVelocity = maxVelocity;
        this.minVelocity = minVelocity;
        //this.numberOfSeats = numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public double getMinVelocity() {
        return minVelocity;
    }

    public void setMinVelocity(double minVelocity) {
        this.minVelocity = minVelocity;
    }


}
