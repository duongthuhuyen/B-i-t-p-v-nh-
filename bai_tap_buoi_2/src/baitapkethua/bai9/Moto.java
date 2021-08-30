package baitapkethua.bai9;

public class Moto extends Travel{

    public Moto(String name, double maxVelocity, double minVelocity) {
        super(name, maxVelocity, minVelocity);
    }

    @Override
    public double[] getTaxs() {
        return new double[] {Tax.taxs[moto][vat],Tax.taxs[moto][registration]};
    }

    @Override
    public double getExciceTax() {
        return ExciceTax1;
    }
}
