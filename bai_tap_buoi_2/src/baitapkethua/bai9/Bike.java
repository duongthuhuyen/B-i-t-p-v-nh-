package baitapkethua.bai9;

public class Bike extends Travel{

    public Bike(String name, double maxVelocity, double minVelocity) {
        super(name, maxVelocity, minVelocity);
    }

    @Override
    public double[] getTaxs() {
        return new double[] {Tax.taxs[bike][vat],Tax.taxs[bike][registration]};
    }

    @Override
    public double getExciceTax() {
        return ExciceTax.ExciceTax1;
    }
}
