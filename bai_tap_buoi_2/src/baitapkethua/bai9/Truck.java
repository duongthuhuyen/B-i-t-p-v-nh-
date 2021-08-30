package baitapkethua.bai9;

public class Truck extends Travel{

    public Truck(String name, double maxVelocity, double minVelocity) {
        super(name, maxVelocity, minVelocity);
    }


    @Override
    public double[] getTaxs() {
        return new double[] {Tax.taxs[truck][vat],Tax.taxs[truck][registration]};
    }

    @Override
    public double getExciceTax() {
        return ExciceTax1;
    }
}
