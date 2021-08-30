package baitapkethua.bai9;

public class Bus extends Travel{
    private int numberOfSeats;
    public Bus(String name, double maxVelocity, double minVelocity, int numberOfSeats) {
        super(name, maxVelocity, minVelocity);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double[] getTaxs() {
        return new double[] {Tax.taxs[bus][vat],Tax.taxs[bus][registration]};
    }

    @Override
    public double getExciceTax() {
        if(this.numberOfSeats >= 5){
            return ExciceTax2;
        }
        return ExciceTax3;
    }
}
